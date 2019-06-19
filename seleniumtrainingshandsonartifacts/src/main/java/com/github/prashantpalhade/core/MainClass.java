package com.github.prashantpalhade.core;

import com.github.prashantpalhade.abstracts.AbstractCalculation;

public class MainClass extends AbstractCalculation {


    public void add(int i, int j) {
        int addition = i + j;
        System.out.println("Addition :" + addition);
    }
}
