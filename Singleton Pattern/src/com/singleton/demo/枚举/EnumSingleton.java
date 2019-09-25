package com.singleton.demo.枚举;

public class EnumSingleton {

    private EnumSingleton(){}
    public static EnumSingleton getInstance(){
        return Singleton.MALE.getInstance();
    }

    private  enum Singleton{

        MALE,;

        private EnumSingleton singleton;
        //JVM会保证此方法绝对只调用一次
        Singleton(){
            System.out.println(111);
            singleton = new EnumSingleton();
        }
        public EnumSingleton getInstance(){
            System.out.println(222);
            return singleton;
        }
    }




}
