package org.springFramework;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("20")
    int age;

    @Autowired
    Computer com;

    public Alien(){
        System.out.println("Alien object created");
    }

    public Computer com() {
        return com;
    }

    public void setCom(Computer com) {
        this.com = com;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void coding(){
        System.out.println("This is the alien");
        System.out.println("My age is: " + age);
        com.code();
    }
}
