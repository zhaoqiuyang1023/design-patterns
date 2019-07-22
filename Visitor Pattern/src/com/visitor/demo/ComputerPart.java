package com.visitor.demo;

public interface ComputerPart {

    public void accept(ComputerPartVisitor computerPartVisitor);
}
