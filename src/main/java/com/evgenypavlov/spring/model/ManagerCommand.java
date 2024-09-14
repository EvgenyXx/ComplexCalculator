package com.evgenypavlov.spring.model;

public interface ManagerCommand {
    String add(ComplexCalculator calculator);
    String multi(ComplexCalculator calculator);
    String division (ComplexCalculator calculator);
    String deduction (ComplexCalculator calculator);

}
