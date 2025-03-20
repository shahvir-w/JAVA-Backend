package com.yeo.quickstart;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Dev {


    @Autowired // field injection
    @Qualifier("desktop")
    private Computer comp;

    /*
    public Dev(Laptop laptop) { // constructor injection
        this.laptop = laptop;
    }


    @Autowired
    public void setLaptop(Laptop laptop) { // setter injection
        this.laptop = laptop;
    }
     */

    public void build(){
        System.out.println("working on project");

        comp.compile();

    }
}
