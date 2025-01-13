package org.springFramework;

class Pramod{
    public void info(){
        System.out.println("Hi. I'm Pramod Bhosale");
    }
}

public class Alien {
    int age;
    String nm;

    public Alien(int age, String nm){
        this.age = age;
        this.nm = nm;
    }

    public String nm() {
        return nm;
    }

    public void setNm(String nm) {
        this.nm = nm;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        System.out.println("Name is: " + nm);
        System.out.println("My age is : " + age);
        System.out.println("Coding...");
    }
}
