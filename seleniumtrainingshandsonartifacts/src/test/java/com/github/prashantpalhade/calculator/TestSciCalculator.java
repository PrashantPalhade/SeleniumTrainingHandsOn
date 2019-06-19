package com.github.prashantpalhade.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSciCalculator {
    @Test
    void testSqrRoot() {
        ScientificCalculator sciCalObj = new ScientificCalculator();
        int result = sciCalObj.sqrRoot(9);
        Assert.assertEquals(result,3);
    }
    @Test
    void testcube() {
        ScientificCalculator sciCalObj = new ScientificCalculator();
        int result = sciCalObj.cube(9);
        Assert.assertEquals(result,729);
    }
    
    @Test
    void testAddition() {
        ScientificCalculator sciCalObj = new ScientificCalculator();
        int result = sciCalObj.addition(10,12);
        Assert.assertEquals(result,22);
    }
    
    @Test
    void testSubstract() {
        ScientificCalculator sciCalObj = new ScientificCalculator();
        int result = sciCalObj.sub(10,12);
        Assert.assertEquals(result,-2);
    }
    @Test
    void testDivision() {
        ScientificCalculator sciCalObj = new ScientificCalculator();
        int result = sciCalObj.div(10,5);
        Assert.assertEquals(result,2);
    }
     @Test
    void testMulti() {
        ScientificCalculator sciCalObj = new ScientificCalculator();
        int result = sciCalObj.mul(10,5);
        Assert.assertEquals(result,50);
    }
    
}
