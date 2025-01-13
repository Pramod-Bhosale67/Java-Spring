package org.springFramework;

public class Alien {
    int age;
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
