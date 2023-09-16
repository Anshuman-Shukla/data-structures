package com.dataStructure.practice.designpattern.singleton;
//constructor Should be Private
// Object create with the help static

/**
 * How can we break Singleton Design pattern
 * 1. Reflection API to break Singleton pattern.
 *  Solution:
 *  if object is there ==> throw exception
 *2 Using ENUM
 * 3 =. Deserialization
 * Soulution Implement Readresolve Method with Object return
 * 4 cloneing
 *
 */
public class SingletonDesignPattern {
    private static SingletonDesignPattern singletonDesignPattern;
    private SingletonDesignPattern(){
/*if(singletonDesignPattern!= null){
    throw  new RuntimeException("Trying to break Singleton");*/
}

    public static SingletonDesignPattern getInstance(){
        if(singletonDesignPattern==null){
            synchronized (SingletonDesignPattern.class) {
                if (singletonDesignPattern == null) {
                    singletonDesignPattern = new SingletonDesignPattern();
                }
            }
        }
        return singletonDesignPattern;
    }
}
