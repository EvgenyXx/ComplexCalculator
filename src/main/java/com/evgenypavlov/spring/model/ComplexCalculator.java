package com.evgenypavlov.spring.model;

import com.evgenypavlov.spring.model.writer.LoggerCalc;

import java.util.logging.Logger;

public class ComplexCalculator  extends Calculator implements ManagerCommand {
    private static final Logger LOGGER = Logger.getLogger(ComplexCalculator.class.getName());

    public ComplexCalculator(double real, double imaginary) {
        super(real, imaginary);
    }

    @Override
    public  String add(ComplexCalculator calculator){
        LoggerCalc.info("Сложение комплексных чисел");
        double real = this.getReal() + calculator.getReal();
        double imaginary = this.getImaginary() + calculator.getImaginary();
        return real + "+" + imaginary + "i";
    }

    @Override
    public String multi(ComplexCalculator calculator) {
        LoggerCalc.info("Умножение комплексных чисел");
        double real = ( this.getReal() * calculator.getReal()) - (this.getImaginary() * calculator.getImaginary());
        double imaginary = (this.getReal() * calculator.getImaginary()) + (this.getImaginary() * calculator.getReal());
        return real + "+" + imaginary + "i";
    }

    @Override
    public String division(ComplexCalculator calculator) {
        LoggerCalc.info("Деление комплексных чисел");
        double divisor = calculator.getReal() * calculator.getReal() + calculator.getImaginary() * calculator.getImaginary();
        double real = (this.getReal() * calculator.getReal() + this.getImaginary() * calculator.getImaginary()) / divisor;
        double imaginary = (this.getImaginary() * calculator.getReal() - this.getReal() * calculator.getImaginary()) / divisor;
        return real + "+" + imaginary + "i";
    }

    @Override
    public String deduction(ComplexCalculator calculator) {
        LoggerCalc.info("Вычетание комплексных чисел");
        double real = this.getReal() - calculator.getReal();
        double imaginary = this.getImaginary() - calculator.getImaginary();
        return real + "+" + imaginary + "i";
    }

}
