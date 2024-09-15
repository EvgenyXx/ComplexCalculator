package com.evgenypavlov.spring;


import com.evgenypavlov.spring.view.ConsoleUI;
import com.evgenypavlov.spring.view.View;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {

        View view = new ConsoleUI();
        view.start();

    }
}