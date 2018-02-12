package com.kodilla.spring.calculator;

import org.junit.Assert;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CalculatorTestSuite {
    @Test
    public void testCalculations() {
        //Given
        ApplicationContext context = new AnnotationConfigApplicationContext("com.kodilla.spring");
        Calculator calculator = context.getBean(Calculator.class);
        double a = 10;
        double b = 2;
        //When
        double result1 = calculator.sum(a, b);
        double result2 = calculator.sub(a, b);
        double result3 = calculator.mul(a, b);
        double result4 = calculator.div(a, b);
        //Then
        Assert.assertEquals(result1, 12, 0);
        Assert.assertEquals(result2, 8, 0);
        Assert.assertEquals(result3, 20, 0);
        Assert.assertEquals(result4, 5, 0);

    }
}
