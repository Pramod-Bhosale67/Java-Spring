package model;

import org.springframework.stereotype.Component;

@Component
public class Desktop implements Computer{
    Computer com;

    public void code(){
        System.out.println("Coding using the Desktop...");
    }
}
