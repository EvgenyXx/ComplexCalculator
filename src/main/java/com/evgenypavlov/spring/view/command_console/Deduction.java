package com.evgenypavlov.spring.view.command_console;

import com.evgenypavlov.spring.view.ConsoleUI;

import java.sql.SQLException;

public class Deduction extends Command{
    @Override
    public void execute() throws SQLException {
        getConsoleUI().deduction();
    }

    public Deduction(String description, ConsoleUI consoleUI) {
        super(description, consoleUI);
    }
}
