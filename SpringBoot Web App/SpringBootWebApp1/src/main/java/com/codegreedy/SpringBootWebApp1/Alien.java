package com.codegreedy.SpringBootWebApp1;

public class Alien {
    private int id;
    private String aname;

    public int id() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String aname() {
        return aname;
    }

    public void setAname(String aname) {
        this.aname = aname;
    }

    @Override
    public String toString() {
        return "Alien{" +
                "id=" + id +
                ", aname='" + aname + '\'' +
                '}';
    }
}
