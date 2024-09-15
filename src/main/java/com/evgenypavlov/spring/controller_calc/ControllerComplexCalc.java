package com.evgenypavlov.spring.controller_calc;

import com.evgenypavlov.spring.service.ManagerServiceInterface;
import com.evgenypavlov.spring.service.ServiceCompCalculator;

import java.sql.SQLException;

public class ControllerComplexCalc implements ControllerManagerInterface{
    private final ManagerServiceInterface managerServiceInterface = new ServiceCompCalculator();

    @Override
    public void add(double real, double imaginary) throws SQLException {
        System.out.println(managerServiceInterface.add(real, imaginary));
    }

    @Override
    public void multi(double real, double imaginary) throws SQLException {
        System.out.println(managerServiceInterface.multi(real, imaginary));
    }

    @Override
    public void division(double real, double imaginary) throws SQLException {
        System.out.println(managerServiceInterface.division(real,imaginary));
    }

    @Override
    public void deduction(double real, double imaginary) throws SQLException {
        System.out.println(managerServiceInterface.deduction(real, imaginary));
    }
}
