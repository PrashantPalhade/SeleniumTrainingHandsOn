package com.github.prashantpalhade.abstracts;

public abstract class AbstractCalculation {
    public abstract void add(int i, int j);

    public void sub(int i, int j) {
        int sub = i - j;
        System.out.println("Sub :" + sub);
    }

}
