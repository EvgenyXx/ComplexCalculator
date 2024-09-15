package com.evgenypavlov.spring.controller_calc;

import java.sql.SQLException;

public interface ControllerManagerInterface {
    void add(double real,double  imaginary) throws SQLException;
    void multi(double real,double  imaginary) throws SQLException;
    void division (double real,double  imaginary) throws SQLException;
    void deduction (double real,double  imaginary) throws SQLException;
}
