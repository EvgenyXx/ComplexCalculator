package com.evgenypavlov.spring.service;

import java.sql.SQLException;

public interface ManagerServiceInterface {
    String add(double real,double  imaginary) throws SQLException;
    String multi(double real,double  imaginary) throws SQLException;
    String division (double real,double  imaginary) throws SQLException;
    String deduction (double real,double  imaginary) throws SQLException;
}
