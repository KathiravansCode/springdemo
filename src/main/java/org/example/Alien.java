package org.example;

public class Alien {


    private int age;
    private Computer comp;
    Alien(){
        System.out.println("Alien constructor called");
//        this.age=age;
//        this.comp=comp;
    }


    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age=age;
    }
//   public Laptop getLap(){
//        return lap;
//   }
//    public void setLap(Laptop lap){
//        System.out.println("Setter function for laptop called");
//        this.lap=lap;
//    }

    public Computer getComp() {
        return comp;
    }

    public void setComp(Computer comp) {
        this.comp = comp;
    }

    public void code(){
        System.out.println("Coding the project");
        comp.compile();
    }

}
