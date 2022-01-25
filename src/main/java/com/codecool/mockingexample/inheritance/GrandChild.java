package com.codecool.mockingexample.inheritance;

public class GrandChild extends ChildClass{
    public GrandChild(int a, int b) {
        super(a, b);
    }

    @Override
    public String toString() {
        return "GrandChild{" +
                "b=" + b +
                ", c=" + c +
                ", d=" + d +
                "} " + super.toString();
    }
}
