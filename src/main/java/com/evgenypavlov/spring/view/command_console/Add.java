package com.evgenypavlov.spring.view.command_console;

import com.evgenypavlov.spring.view.ConsoleUI;

public class Add extends Command{
    @Override
    public void execute() {
        getConsoleUI().add();
    }

    public Add(String description, ConsoleUI consoleUI) {
        super(description, consoleUI);
    }
}
