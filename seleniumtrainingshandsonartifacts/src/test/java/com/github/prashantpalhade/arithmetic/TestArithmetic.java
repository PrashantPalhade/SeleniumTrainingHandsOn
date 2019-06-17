package com.github.prashantpalhade.arithmetic;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestArithmetic {
    @Test
    void testAdd() {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.add(4, 5);
        Assert.assertEquals(9, result);
    }

    @Test
    void testMul() {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.mult(3, 4);
        Assert.assertEquals(-12, result);
    }

    @Test
    void testDiv() {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.div(12, 4);
        Assert.assertEquals(3, result);
    }

    @Test
    void testSub() {
        Arithmetic arithmetic = new Arithmetic();
        int result = arithmetic.sub(4, 3);
        Assert.assertEquals(2, result);
    }
}
