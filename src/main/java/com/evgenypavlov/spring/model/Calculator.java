package com.evgenypavlov.spring.model;

public abstract class Calculator {
    private final double real;
    private final double imaginary;

    public Calculator(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public double getReal() {
        return real;
    }

    public double getImaginary() {
        return imaginary;
    }

    @Override
    public String toString() {
        return "Calculator{" +
                "real=" + real +
                ", imaginary=" + imaginary +
                '}';
    }
}
