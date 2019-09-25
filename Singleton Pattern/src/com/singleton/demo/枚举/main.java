package com.singleton.demo.枚举;

/**
 * @author : Alan
 * @date : 2019/8/16  14:23
 */
public class main {

    public static void main(String [] args){
        System.out.println(000);
        EnumSingleton.getInstance();

        System.out.println(Target.getInstance());

    }
}
