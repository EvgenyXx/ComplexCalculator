package com.evgenypavlov.spring.model.calc;

public abstract class Calculator {
    private  double real;
    private  double imaginary;

    public Calculator(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void setReal(double real) {
        this.real = real;
    }

    public void setImaginary(double imaginary) {
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
