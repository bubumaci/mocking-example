package com.codecool.mockingexample.inheritance;

public abstract class ChildClass extends ParentAbstract {

    int b;

    public ChildClass(int a, int b) {
        super(3);
        System.out.println("child class constructor");
        this.b = b;
    }

    //    OVERRIDING
    @Override
    public ChildClass run() {
        System.out.println("run");
        return null;
    }

    //    OVERLOADING
    private ChildClass run(int i) {
        System.out.println("run " + i);
        return null;
    }

    //    OVERLOADING
    protected ChildClass run(int i, String message) {
        System.out.println(message + " " + i);
        return null;
    }
}
