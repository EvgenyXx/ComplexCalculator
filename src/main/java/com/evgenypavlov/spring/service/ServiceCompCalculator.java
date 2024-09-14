package com.evgenypavlov.spring.service;

import com.evgenypavlov.spring.model.ComplexCalculator;


public class ServiceCompCalculator implements ManagerServiceInterface {
    private ComplexCalculator command;


    @Override
    public String add(double real, double imaginary) {
       command = new ComplexCalculator(real, imaginary);
        return command.add(command);
    }

    @Override
    public String multi(double real, double imaginary) {
        command = new ComplexCalculator(real, imaginary);
        return command.multi(command);
    }

    @Override
    public String division(double real, double imaginary) {
        command = new ComplexCalculator(real, imaginary);
        return command.division(command);
    }

    @Override
    public String deduction(double real, double imaginary) {
        command = new ComplexCalculator(real, imaginary);
        return command.deduction(command);
    }
}
