package com.evgenypavlov.spring.model.calc;

import java.sql.SQLException;

public class ComplexCalculatorFacade implements FacadeManagerInterface{



    @Override
    public String add(double real, double imaginary) throws SQLException {
    ComplexCalculator  command = new ComplexCalculator(real, imaginary);
        return command.add(command);
    }

    @Override
    public String multi(double real, double imaginary) throws SQLException {
       ComplexCalculator command = new ComplexCalculator(real, imaginary);
        return command.multi(command);
    }

    @Override
    public String division(double real, double imaginary) throws SQLException {
      ComplexCalculator  command = new ComplexCalculator(real, imaginary);
        return command.division(command);
    }

    @Override
    public String deduction(double real, double imaginary) throws SQLException {
       ComplexCalculator command = new ComplexCalculator(real, imaginary);
        return command.deduction(command);
    }
}
