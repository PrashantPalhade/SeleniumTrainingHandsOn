package com.github.prashantpalhade.calculator;

import com.github.prashantpalhade.interfaces.Operations;
import com.github.prashantpalhade.interfaces.ScientificOperations;

public class ScientificCalculator implements Operations, ScientificOperations {


    public double sqrRoot(double no1) {
        double sqrt = Math.sqrt(no1);
        print("Square root of" + no1 + " is :" + sqrt);
        return sqrt;

    }

    public double sqrRoot(int no1) {
        double sqrt = Math.sqrt(no1);
        print("Square root of" + no1 + " is :" + sqrt);
        return sqrt;

    }

    public double cube(double no1) {
        double cube1 = no1 * no1 * no1;
        print("Cube of" + no1 + " is :" + cube1);
        return cube1;
    }

    public String print(String ans) {
        System.out.println(ans);
        return ans;
    }

    public int addition(int no1, int no2) {
        int add = no1 + no2;
        print("Addition of 2 nos" + no1 + " " + no2 + " is :" + add);
        return no1 + no2;
    }

    public int sub(int no1, int no2) {

        int sub1 = no1 - no2;
        print("Substraction of 2 nos" + no1 + " " + no2 + " is :" + sub1);
        return sub1;
    }

    public int div(int no1, int no2) {
        int div1 = no1 / no2;
        print("Division of 2 nos" + no1 + " " + no2 + " is :" + div1);

        return div1;
    }

    public int mul(int no1, int no2) {
        int mul1 = no1 + no2;
        print("Multiplicetion of 2 nos" + no1 + " " + no2 + " is :" + mul1);

        return mul1;
    }
}
