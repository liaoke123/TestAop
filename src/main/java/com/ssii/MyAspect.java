package com.ssii;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;

/*
定义的增强
 */
public class MyAspect {
    //前置通知
    public void myBefore(JoinPoint joinPoint){
        System.out.println("前置通知,目标:");
        System.out.println(joinPoint.getTarget() + ",方法名称:");
        System.out.println(joinPoint.getSignature().getName());
    }

    //后置通知
    public void myAfterReturning(JoinPoint joinPoint){
        System.out.println("后置通知,方法名称为:" + joinPoint.getSignature().getName());
    }

    //环绕通知
    public Object myAround(ProceedingJoinPoint proceedingJoinPoint)throws Throwable{
        System.out.println("环绕通知开始");
        //执行目标方法
        Object proceed = proceedingJoinPoint.proceed();
        System.out.println("环绕通知结束");
        //返回值
        return proceed;
    }

    //异常通知
    public void myAfterThrowing(JoinPoint joinPoint,Throwable e ){
        System.out.println("异常通知,程序出错了" + e.getMessage());
    }

    //最终通知
    public void myAfter(){
        System.out.println("最终通知执行了");
    }





}
