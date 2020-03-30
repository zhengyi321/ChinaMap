package com.chinamap.core.aop;

import java.lang.reflect.Method;
import java.sql.SQLException;
import java.util.Date;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;


/**
 * AOP实现日志
 * 
 * @author 最后的轻语_dd43
 * 
 */
@Order(3)
@Component
@Aspect
public class LogAopAspect {


	
}