package com.chinamap.listener;

import com.chinamap.modular.entity.ReadAndGood;
import com.chinamap.modular.service.ReadAndGoodService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.SpringBeanAutowiringSupport;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.text.SimpleDateFormat;
import java.util.*;


public class TimeListener implements ServletContextListener {

    @Autowired
    private ReadAndGoodService readAndGoodService;
    private Timer timer = null ;
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        SpringBeanAutowiringSupport.processInjectionBasedOnCurrentContext(this);//解决Autowired在servlet中失效

        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
//            Date date = new Date(System.currentTimeMillis());//当天的时间
        Date date=new Date();//取时间
        Calendar calendar = new GregorianCalendar();
        calendar.setTime(date);
//        calendar.add(calendar.DATE,1);//把日期往后增加一天.整数往后推,负数往前移动
        calendar.add(calendar.DATE,0);//当天
        date=calendar.getTime();
        System.out.println("sssssssssss"+sdf.format(date));
        List<ReadAndGood> readAndGoodList = readAndGoodService.selectBytime(sdf.format(date)+"%");
        System.out.println("this is readlist:"+readAndGoodList.size());
        todayTimeTask(readAndGoodList);



//        timer.scheduleAtFixedRate(new TimerTask() {
//            public void run() {
//                System.out.println("-------在这里写要处理的事情就可以了--------");
//            }
//        }, time, 1000 * 60 * 60 * 24);// 这里设定将延时每天固定执行
    }

    //当天的执行任务
    private void todayTimeTask(List<ReadAndGood> readAndGoodList){



        Calendar calendar = Calendar.getInstance();
//        calendar.set(Calendar.HOUR_OF_DAY, 10); // 控制时
//        calendar.set(Calendar.MINUTE, 57);       // 控制分
//        calendar.set(Calendar.SECOND, 0);       // 控制秒

        Date time = calendar.getTime();         // 得出执行任务的时间,此处为今天的12：00：00

        Timer timer = new Timer();
//        每篇文章阅读量
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try{
                    Random random = new Random();
                    Thread.sleep(random.nextInt(5000));
                    for(int i = 0;i<readAndGoodList.size();i++){
                        Long readers = readAndGoodList.get(i).getReader();
                        readers += random.nextInt(5)+1;//随机增加一到五个阅读量
                        readAndGoodList.get(i).setReader(readers);
                        readAndGoodService.updateByPrimaryKey(readAndGoodList.get(i));
                    }

                }catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println("11111111111111111111111111 this is timetask");
            }
        }, 0, 10000);//延迟一秒  每2秒执行
//        每篇文章点赞量
        timer.schedule(new TimerTask() {
            @Override
            public void run() {
                try{
                    Random random = new Random();
                    Thread.sleep(random.nextInt(5000));
                    for(int i = 0;i<readAndGoodList.size();i++){
                        Long good = readAndGoodList.get(i).getGood();
                        good += random.nextInt(2);//随机增加一到五个阅读量
                        readAndGoodList.get(i).setGood(good);
                        readAndGoodService.updateByPrimaryKey(readAndGoodList.get(i));
                    }

                }catch(Exception e){
                    e.printStackTrace();
                }
                System.out.println("11111111111111111111111111 this is timetask");
            }
        }, 0, 7000);//延迟一秒  每2秒执行
//        }, 5000);//5秒内执行一次
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}
