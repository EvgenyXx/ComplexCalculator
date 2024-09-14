package com.evgenypavlov.spring.view;

import com.evgenypavlov.spring.controller_calc.ControllerComplexCalc;
import com.evgenypavlov.spring.controller_calc.ControllerManagerInterface;
import com.evgenypavlov.spring.view.command_console.MainCommand;

import java.util.Scanner;

public class ConsoleUI implements View {
    private final Scanner scanner = new Scanner(System.in);
    private boolean work = true;
    private final ControllerManagerInterface controllerManagerInterface = new ControllerComplexCalc();
    private final MainCommand mainCommand = new MainCommand(this);

    @Override
    public void start() {
        while (work) {
            System.out.println(mainCommand.menu());
            String choiceS = scanner.nextLine();
            int choice = (int) inputNumber(choiceS);
            mainCommand.execute(choice);
        }
    }

    @Override
    public void add() {
        System.out.println("Вы выбрали сложение");
        System.out.println("Введите первое число :");
        String as = scanner.nextLine();
        double a = inputNumber(as);
        System.out.println("Введите второе число :");
        String bs = scanner.nextLine();
        double b = inputNumber(bs);
        controllerManagerInterface.add(a, b);
    }

    @Override
    public void multi() {
        System.out.println("Вы выбрали умножение");
        System.out.println("Введите первое число :");
        String as = scanner.nextLine();
        double a = inputNumber(as);
        System.out.println("Введите второе число :");
        String bs = scanner.nextLine();
        double b = inputNumber(bs);
        controllerManagerInterface.multi(a, b);
    }

    @Override
    public void division() {
        System.out.println("Вы выбрали вычетание");
        System.out.println("Введите первое число :");
        String as = scanner.nextLine();
        double a = inputNumber(as);
        System.out.println("Введите второе число :");
        String bs = scanner.nextLine();
        double b = inputNumber(bs);
        controllerManagerInterface.division(a, b);
    }


    @Override
    public void deduction() {
            System.out.println("Вы выбрали деление");
            System.out.println("Введите первое число :");
            String as = scanner.nextLine();
            double a = inputNumber(as);
            System.out.println("Введите второе число :");
            String bs = scanner.nextLine();
            double b = inputNumber(bs);
            controllerManagerInterface.deduction(a, b);
    }

    @Override
    public void finish() {
      scanner.close();
      work = false;
        System.out.println("до скорых встреч");
    }


    private double inputNumber(String choice) {
        while (true) {
            if (choice.trim().isEmpty()) {
                System.err.println("Вы ввели пустую строку");
                System.out.println("Введите число:");
                choice = scanner.nextLine();
                continue;
            }
            try {
                return Double.parseDouble(choice);
            } catch (NumberFormatException e) {
                System.err.println("Некорректный формат числа. Попробуйте снова:");
                choice = scanner.nextLine();
            }
        }
    }
}
