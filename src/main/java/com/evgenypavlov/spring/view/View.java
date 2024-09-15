package com.evgenypavlov.spring.view;

import java.sql.SQLException;

public interface View {
    void start() throws SQLException;
    void add() throws SQLException;
    void multi() throws SQLException;
    void division () throws SQLException;
    void deduction () throws SQLException;
    void finish();
}
