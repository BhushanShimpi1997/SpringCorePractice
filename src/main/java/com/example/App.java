package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        ApplicationContext context=new ClassPathXmlApplicationContext("beandef.xml");
        
        Student st = context.getBean("student", Student.class);
        System.out.println(st.getName());
        System.out.println(st.getId());
        
        ApplicationContext cont=new AnnotationConfigApplicationContext(JavaConfig.class);
        Address address = cont.getBean(Address.class);
        System.out.println(address);
        
        
    }
}
