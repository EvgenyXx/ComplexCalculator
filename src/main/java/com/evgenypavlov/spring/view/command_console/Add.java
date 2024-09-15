package com.evgenypavlov.spring.view.command_console;

import com.evgenypavlov.spring.view.ConsoleUI;

import java.sql.SQLException;

public class Add extends Command{
    @Override
    public void execute() throws SQLException {
        getConsoleUI().add();
    }

    public Add(String description, ConsoleUI consoleUI) {
        super(description, consoleUI);
    }
}
