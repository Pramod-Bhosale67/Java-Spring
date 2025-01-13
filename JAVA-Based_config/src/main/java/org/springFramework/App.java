package org.springFramework;

import org.springFramework.config.ConfigApp;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App
{
    public static void main( String[] args )
    {
        //first add the dependency of the spring in POM file
        ApplicationContext context = new AnnotationConfigApplicationContext(ConfigApp.class);

        Alien alien = context.getBean(Alien.class);
        alien.coding();

//        Desktop desk = context.getBean( Desktop.class);
//        desk.code();
//
//        Desktop desk1 = context.getBean(Desktop.class);
//        desk.code();

//        Laptop lap = context.getBean(Laptop.class);
//        lap.code();
    }
}
