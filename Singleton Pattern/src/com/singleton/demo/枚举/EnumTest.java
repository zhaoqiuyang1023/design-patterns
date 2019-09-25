package com.singleton.demo.枚举;

/**
 * @author : Alan
 * @date : 2019/8/16  14:25
 */
public enum EnumTest {

    SIGN;

    private Target target;

    private static Target getin(){
       return getInstance();
    }

    EnumTest() {
        Target target = new Target();

    }

    public Target getInstance() {

        return target;
    }
}
