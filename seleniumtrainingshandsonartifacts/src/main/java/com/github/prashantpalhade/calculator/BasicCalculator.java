package com.github.prashantpalhade.calculator;

import com.github.prashantpalhade.interfaces.Operations;

public class BasicCalculator implements Operations {

    public int addition(int no1, int no2) {

        return no1 + no2;
    }

    public int sub(int no1, int no2) {
        return no1 -no2;
    }

    public int div(int no1, int no2) {
        return no1/no2;
    }

    public int mul(int no1, int no2) {
        return no1*no2;
    }
}
