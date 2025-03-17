package org.example;

public class Laptop implements Computer {
    Laptop(){
        System.out.println("Laptop constructor called");
    }
    public void compile(){
        System.out.println("compiling using laptop");
    }
}
