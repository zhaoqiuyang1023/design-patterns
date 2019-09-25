package com;

public class Context {

    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy=strategy;
    }
    public void jiusna(){
        strategy.calculatePrice();
    }
}
