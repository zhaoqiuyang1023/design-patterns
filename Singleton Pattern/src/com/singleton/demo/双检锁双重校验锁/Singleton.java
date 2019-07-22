package com.singleton.demo.双检锁双重校验锁;

public class Singleton {

    private volatile static Singleton singleton;

    private Singleton() {
        System.out.println("234234");
    }

    public static Singleton getSingleton() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }

    public static void main(String[] args){
        getSingleton();
    }
}
