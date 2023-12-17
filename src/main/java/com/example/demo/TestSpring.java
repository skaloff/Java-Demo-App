package com.example.demo;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        DemoApplication testBean = context.getBean("testBean", DemoApplication.class);

        System.out.println(testBean.getName());

        context.close();
    }
}
