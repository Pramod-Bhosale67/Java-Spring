package org.springFramework.config;

import org.springFramework.Alien;
import org.springFramework.Computer;
import org.springFramework.Desktop;
import org.springFramework.Laptop;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

@Configuration
public class ConfigApp {

    @Bean
    public Alien alien( @Autowired Computer com){
        Alien obj = new Alien();
        obj.setAge(21);
        obj.setCom(com);
        return obj;
    }

    @Bean
//    @Scope("prototype")
    public Desktop desktop(){
        return new Desktop();
    }

    @Bean
    @Primary

    public Laptop laptop(){
        return new Laptop();
    }


}
