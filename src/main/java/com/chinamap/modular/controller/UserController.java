package com.chinamap.modular.controller;

import com.chinamap.core.util.GlobalResult;
import com.chinamap.modular.entity.Pay;
import com.chinamap.modular.entity.ReadAndGood;
import com.chinamap.modular.service.PayService;
import com.chinamap.modular.service.ReadAndGoodService;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.SQLException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

@Controller
public class UserController {

    @Autowired
    private PayService payService;


    /**
     *
     * @Title: login
     * @Description: 用户登录
     * @param user_code
     * @param user_pwd
     * @return
     */
    @RequestMapping(value = "/user/login", method = RequestMethod.POST)
    @ResponseBody
    public GlobalResult login(String user_code, String user_pwd) {
        try {



           // 1.创建令牌
//            System.out.println("user_code:"+user_code+"  user_pwd:"+user_pwd);
            UsernamePasswordToken token = new UsernamePasswordToken(user_code, user_pwd);
//            System.out.println("success");
            // 2.获取主题subject
            Subject subject = SecurityUtils.getSubject();
//            System.out.println("success11");
            // 3.执行login方法
            subject.login(token);
//            System.out.println("success22");

            // 4.登录日志记录
        /*    Log log = new Log();
            log.setOperatedate(new Date());
            log.setOperateor(user_code);
            log.setOperateresult("正常");
            log.setOperatetype("登录");
            log.setIp(UserUtils.getIpAddress());
            logService.addLog(log);*/
            return GlobalResult.build(200, "");
//			User user = userService.findUserByCodeAndPwd(user_code, user_pwd);
//			if (user != null) {
//				UserUtils.setSessionUser(user);
//				return GlobalResult.build(200, "");
//			} else {
//				return GlobalResult.build(400, "账号或密码错误");
//			}
        } catch (AuthenticationException e) {
            e.printStackTrace();
            return GlobalResult.build(400, "账号或密码错误");
   /*     } catch (SQLException e) {
            e.printStackTrace();
            return GlobalResult.build(500, "服务端错误");
        }*/
        }
    }

    @RequestMapping(value = "/user/paylist", method = RequestMethod.POST)
    @ResponseBody
    public List<Pay> getPayList(){
        List<Pay> payList = payService.selectPayList();
        System.out.println("payListSize:" +payList.size());
        return payList;
    }
}
