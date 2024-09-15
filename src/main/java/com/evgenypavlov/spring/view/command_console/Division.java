package com.evgenypavlov.spring.view.command_console;

import com.evgenypavlov.spring.view.ConsoleUI;

import java.sql.SQLException;

public class Division extends Command{
    @Override
    public void execute() throws SQLException {
        getConsoleUI().division();
    }

    public Division(String description, ConsoleUI consoleUI) {
        super(description, consoleUI);
    }
}
