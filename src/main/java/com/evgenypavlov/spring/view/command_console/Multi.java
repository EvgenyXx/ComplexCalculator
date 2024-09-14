package com.evgenypavlov.spring.view.command_console;

import com.evgenypavlov.spring.view.ConsoleUI;

public class Multi extends Command{
    @Override
    public void execute() {
        getConsoleUI().multi();
    }

    public Multi(String description, ConsoleUI consoleUI) {
        super(description, consoleUI);
    }
}
