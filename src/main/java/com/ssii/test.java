package com.ssii;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    //加载spring的配置文件,根据配置文件初始化容器
    ApplicationContext applicationContext =
            new ClassPathXmlApplicationContext("applicationContext.xml");
    //从容器中获取userDao对象
}
