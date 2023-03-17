package com.tmf.sms.teacher.tbackend;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.tmf.sms.teacher.tbackend.models.Teacher;

public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context;
        context = new ClassPathXmlApplicationContext("demo-servlet.xml");
        
        Teacher t1 = (Teacher)context.getBean("t1");
        System.out.println(t1.getTeacherId());
        System.out.println(t1.getTeacherName());
    }
}
