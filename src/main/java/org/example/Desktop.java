package org.example;

public class Desktop implements Computer{
    Desktop(){
        System.out.println("Desktop constructor called");
    }
    @Override
    public void compile() {
        System.out.println("Compiling using desktop");
    }
}
