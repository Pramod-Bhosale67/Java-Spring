package org.springFramework.config;

import org.springFramework.Alien;
import org.springFramework.Computer;
import org.springFramework.Desktop;
import org.springFramework.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan("org.springFramework")
public class ConfigApp {

//    @Bean
//    public Alien alien( @Autowired Computer com){
//        Alien obj = new Alien();
//        obj. acsetAge(21);
//        obj.setCom(com);
//        return obj;
//    }
//
//    @Bean
////    @Scope("prototype") // we can create as many object we want
//    // by deafult singltone : which means single object is created
//    public Desktop desktop(){
//        return new Desktop();
//    }
//
//    @Bean
//    @Primary
//
//    public Laptop laptop(){
//        return new Laptop();
//    }


}
