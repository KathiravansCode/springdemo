package org.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext  context=new ClassPathXmlApplicationContext("spring.xml");
//        Alien obj1=(Alien) context.getBean("alien1");
        Alien obj1=context.getBean(Alien.class);
        obj1.code();
        //          obj1.age=21;
        System.out.println(obj1.getAge());
//        obj1.getAge();
//        Alien obj2=(Alien) context.getBean("alien1");
//        obj2.code();
//        obj1.getAge();

//        System.out.println(obj2.age);
    }
}
