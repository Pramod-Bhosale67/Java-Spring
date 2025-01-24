package model;

import org.springframework.stereotype.Component;

@Component
public class Laptop implements Computer {
    Computer com;

    public void code(){
        System.out.println("Coding using Laptop...");
    }
}
