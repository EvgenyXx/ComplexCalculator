package com.evgenypavlov.spring.model.calc;

import java.sql.SQLException;

public interface FacadeManagerInterface {
    String add(double real,double  imaginary) throws SQLException;
    String multi(double real,double  imaginary) throws SQLException;
    String division (double real,double  imaginary) throws SQLException;
    String deduction (double real,double  imaginary) throws SQLException;
}
