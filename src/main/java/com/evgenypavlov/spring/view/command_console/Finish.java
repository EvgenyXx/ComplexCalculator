package com.evgenypavlov.spring.view.command_console;

import com.evgenypavlov.spring.view.ConsoleUI;

public class Finish extends Command{
    @Override
    public void execute() {
        getConsoleUI().finish();
    }

    public Finish(String description, ConsoleUI consoleUI) {
        super(description, consoleUI);
    }
}
