package com.kodilla.spring.calculator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Calculator {
    private double a;
    private double b;

    @Autowired
    Display display;

    public double sum(double a, double b) {
        display.displayValue(a);
        display.displayValue(b);
        double sum = a + b;
        System.out.println("Wynik dodawania to " + sum);
        return sum;
    }

    public double sub(double a, double b) {
        display.displayValue(a);
        display.displayValue(b);
        double sub = a - b;
        System.out.println("wynik odejmowania to: " + sub);
        return sub;
    }

    public double mul(double a, double b) {
        display.displayValue(a);
        display.displayValue(b);
        double mul = a * b;
        System.out.println("Wynik mnożenia to: " + mul);
        return mul;
    }

    public double div(double a, double b) {
        display.displayValue(a);
        display.displayValue(b);
        double div = a/b;
        System.out.println("Wynik dzielenia to: " + div);
        return div;
    }
}
