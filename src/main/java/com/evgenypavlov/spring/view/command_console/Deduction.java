package com.evgenypavlov.spring.view.command_console;

import com.evgenypavlov.spring.view.ConsoleUI;

public class Deduction extends Command{
    @Override
    public void execute() {
        getConsoleUI().deduction();
    }

    public Deduction(String description, ConsoleUI consoleUI) {
        super(description, consoleUI);
    }
}
