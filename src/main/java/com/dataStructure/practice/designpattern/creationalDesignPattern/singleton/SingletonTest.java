package com.dataStructure.practice.designpattern.creationalDesignPattern.singleton;

import java.lang.reflect.Constructor;

public class SingletonTest {
    public static void main(String[] args) throws Exception{
        SingletonDesignPattern instance1 = SingletonDesignPattern.getInstance();
       // SingletonDesignPattern instance2 = SingletonDesignPattern.getInstance();
        System.out.println(instance1.hashCode());


        //Breaking the singleton pattern using Reflection
      Constructor<SingletonDesignPattern> constructor = SingletonDesignPattern.class.getDeclaredConstructor();
      constructor.setAccessible(true);
        SingletonDesignPattern instance3 = constructor.newInstance();
        System.out.println(instance3.hashCode());


    }
}
