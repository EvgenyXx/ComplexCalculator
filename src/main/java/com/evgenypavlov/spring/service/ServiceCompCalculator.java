package com.evgenypavlov.spring.service;

import com.evgenypavlov.spring.model.calc.ComplexCalculator;
import com.evgenypavlov.spring.model.calc.ComplexCalculatorFacade;
import com.evgenypavlov.spring.model.calc.FacadeManagerInterface;

import java.sql.SQLException;


public class ServiceCompCalculator implements ManagerServiceInterface {
    private final FacadeManagerInterface facadeManagerInterface = new ComplexCalculatorFacade();

    @Override
    public String add(double real, double imaginary) throws SQLException {
        return facadeManagerInterface.add(real, imaginary);
    }

    @Override
    public String multi(double real, double imaginary) throws SQLException {
      return   facadeManagerInterface.multi(real, imaginary);
    }

    @Override
    public String division(double real, double imaginary) throws SQLException {
        return facadeManagerInterface.division(real, imaginary);
    }

    @Override
    public String deduction(double real, double imaginary) throws SQLException {
        return facadeManagerInterface.deduction(real, imaginary);
    }

}
