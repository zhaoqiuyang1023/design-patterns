package com.singleton.demo.枚举;

/**
 * @author : Alan
 * @date : 2019/8/16  14:24
 */
public class Target {

    private Target(){}
    static Target getInstance(){
        return EnumTest.SIGN.getInstance();
    }
}
