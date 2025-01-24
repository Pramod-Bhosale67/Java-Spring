package org.springFramework;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop object created!");
    }
    @Override
    public void code(){
        System.out.println("Coding using the desktop....");
    }
}
