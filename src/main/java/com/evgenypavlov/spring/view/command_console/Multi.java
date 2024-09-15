package com.evgenypavlov.spring.view.command_console;

import com.evgenypavlov.spring.view.ConsoleUI;

import java.sql.SQLException;

public class Multi extends Command{
    @Override
    public void execute() throws SQLException {
        getConsoleUI().multi();
    }

    public Multi(String description, ConsoleUI consoleUI) {
        super(description, consoleUI);
    }
}
