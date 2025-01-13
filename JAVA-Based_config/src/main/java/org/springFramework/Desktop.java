package org.springFramework;

public class Desktop implements Computer{
    public Desktop(){
        System.out.println("Desktop object created!");
    }
    @Override
    public void code(){
        System.out.println("Coding using the desktop....");
    }
}
