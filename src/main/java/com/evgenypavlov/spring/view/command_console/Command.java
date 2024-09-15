package com.evgenypavlov.spring.view.command_console;

import com.evgenypavlov.spring.view.ConsoleUI;

import java.sql.SQLException;

public  abstract class Command {
    private final String description;
    private final ConsoleUI consoleUI;

    public Command(String description, ConsoleUI consoleUI) {
        this.description = description;
        this.consoleUI = consoleUI;
    }

    public String getDescription() {
        return description;
    }

    public ConsoleUI getConsoleUI() {
        return consoleUI;
    }

    public abstract void execute() throws SQLException;
}
