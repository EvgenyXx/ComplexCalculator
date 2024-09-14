package com.evgenypavlov.spring;


import com.evgenypavlov.spring.view.ConsoleUI;
import com.evgenypavlov.spring.view.View;

public class Main {
    public static void main(String[] args) {

        View view = new ConsoleUI();
        view.start();

    }
}