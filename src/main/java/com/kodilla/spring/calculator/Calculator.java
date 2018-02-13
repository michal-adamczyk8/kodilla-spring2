package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    private double a;
    private double b;

    @Autowired
    private Display display;

    public double sum(double a, double b) {
        double sum = a + b;
        display.displayValue(sum);
        return sum;
    }

    public double sub(double a, double b) {
        double sub = a - b;
        display.displayValue(sub);
        return sub;
    }

    public double mul(double a, double b) {
        double mul = a * b;
        display.displayValue(mul);
        return mul;
    }

    public double div(double a, double b) {
        double div = a/b;
        display.displayValue(div);
        return div;
    }
}
