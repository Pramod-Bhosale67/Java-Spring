package model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Alien {
    @Value("25")
    private int age;
    private Computer com;

    public Computer com() {
        return com;
    }

    @Autowired
    @Qualifier("laptop") // or @Primary
    public void setCom(Computer com) {
        this.com = com;
    }

    public int age() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void code(){
        com.code();
    }
}
