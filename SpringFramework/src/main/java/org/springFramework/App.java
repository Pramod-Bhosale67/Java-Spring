package org.springFramework;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        // this gives access to the container. Since we are dealing with spring, hence we need XML
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Alien obj = (Alien) context.getBean("alien");

//        Pramod pramod = (Pramod) context.getBean("pramod");
//        pramod.info();

        obj.code();
    }
}
