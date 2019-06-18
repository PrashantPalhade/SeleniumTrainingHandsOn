package com.github.prashantpalhade.calculator;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestSciCalculator {
    @Test
    void testSqrRoot() {
        ScientificCalculator sciCalObj = new ScientificCalculator();
        double result = sciCalObj.sqrRoot(9);
      // sciCalObj.print("Printing SqrRoot ======   "+ result);
        Assert.assertEquals(result, 3.0);

    }
}