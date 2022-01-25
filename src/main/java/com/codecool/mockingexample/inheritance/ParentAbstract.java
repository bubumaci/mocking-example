package com.codecool.mockingexample.inheritance;

public abstract class ParentAbstract {
    final int c;
    Integer d;

    public ParentAbstract(int c) {
        this.c = c;
        this.d = 0;
        System.out.println("parent class constructor");
    }

    public ParentAbstract(int c, int d) {
        this.c = c;
        this.d = d;
        System.out.println("parent class constructor");
    }

   protected abstract ParentAbstract run();

    public void walk(){
        System.out.println("walk");
    }
}
