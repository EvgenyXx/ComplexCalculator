package com.evgenypavlov.spring.view.command_console;

import com.evgenypavlov.spring.view.ConsoleUI;

public class Division extends Command{
    @Override
    public void execute() {
        getConsoleUI().division();
    }

    public Division(String description, ConsoleUI consoleUI) {
        super(description, consoleUI);
    }
}
