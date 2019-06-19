package com.github.prashantpalhade.core;

import com.github.prashantpalhade.abstracts.AbstractCalculation;
import com.github.prashantpalhade.calculator.BasicCalculator;
import com.github.prashantpalhade.calculator.ScientificCalculator;

public class CreateObjofDiffClass {

    public static void main(String args[]){
        BasicCalculator basiccal = new BasicCalculator();
        ScientificCalculator sciCalc = new ScientificCalculator();
        AbstractCalculation abscalc = new AbstractCalculation() {
            @Override
            public void add(int i, int j) {
                System.out.println("Addition");

            }
        };
        abscalc.sub(3,4);
        abscalc.add(2,3);
    }
}
