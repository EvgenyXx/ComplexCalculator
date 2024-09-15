package com.evgenypavlov.spring.view.command_console;

import com.evgenypavlov.spring.view.ConsoleUI;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MainCommand {
    private final List<Command>commandList = new ArrayList<>();


    public MainCommand(ConsoleUI consoleUI) {
        commandList.add(new Add("Сложение",consoleUI));
        commandList.add(new Multi("умножение",consoleUI));
        commandList.add(new Deduction("вычетание",consoleUI));
        commandList.add(new Division("деление",consoleUI));
        commandList.add(new Finish("выйти с приложения",consoleUI));
    }

    public String menu(){
        System.out.println("калькулятор комплесных чисел");
         StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < commandList.size(); i++) {
            stringBuilder.append(i+1);
            stringBuilder.append(".");
            stringBuilder.append(commandList.get(i).getDescription());
            stringBuilder.append("\n");
        }
        return stringBuilder.toString();
    }

    public void execute(int choice) throws SQLException {
        Command command = commandList.get(choice-1);
        command.execute();
    }
}
