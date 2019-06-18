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
