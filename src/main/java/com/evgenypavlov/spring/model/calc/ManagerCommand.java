package com.evgenypavlov.spring.model.calc;

import java.sql.SQLException;

public interface ManagerCommand {
    String add(ComplexCalculator calculator) throws SQLException;
    String multi(ComplexCalculator calculator) throws SQLException;
    String division (ComplexCalculator calculator) throws SQLException;
    String deduction (ComplexCalculator calculator) throws SQLException;

}
