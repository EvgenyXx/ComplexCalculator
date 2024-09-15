package com.evgenypavlov.spring.model.calc;

import com.evgenypavlov.spring.model.writer.LoggerCalc;
import com.evgenypavlov.spring.model.writer.MySql;

import java.sql.SQLException;

public class ComplexCalculator  extends Calculator implements ManagerCommand {

    private MySql mySql = new MySql();

    public ComplexCalculator(double real, double imaginary) {
        super(real, imaginary);
    }

    @Override
    public  String add(ComplexCalculator calculator) throws SQLException {
        LoggerCalc.info("Сложение комплексных чисел");
        double real = this.getReal() + calculator.getReal();
        double imaginary = this.getImaginary() + calculator.getImaginary();
       saveToDatabase(real,imaginary);
        return real + "+" + imaginary + "i";

    }

    @Override
    public String multi(ComplexCalculator calculator) throws SQLException {
        LoggerCalc.info("Умножение комплексных чисел");
        double real = ( this.getReal() * calculator.getReal()) - (this.getImaginary() * calculator.getImaginary());
        double imaginary = (this.getReal() * calculator.getImaginary()) + (this.getImaginary() * calculator.getReal());
        saveToDatabase(real,imaginary);
        return real + "+" + imaginary + "i";
    }

    @Override
    public String division(ComplexCalculator calculator) throws SQLException {
        LoggerCalc.info("Деление комплексных чисел");
        double divisor = calculator.getReal() * calculator.getReal() + calculator.getImaginary() * calculator.getImaginary();
        double real = (this.getReal() * calculator.getReal() + this.getImaginary() * calculator.getImaginary()) / divisor;
        double imaginary = (this.getImaginary() * calculator.getReal() - this.getReal() * calculator.getImaginary()) / divisor;
        saveToDatabase(real,imaginary);
        return real + "+" + imaginary + "i";
    }

    @Override
    public String deduction(ComplexCalculator calculator) throws SQLException {
        LoggerCalc.info("Вычетание комплексных чисел");
        double real = this.getReal() - calculator.getImaginary();
        double imaginary = this.getImaginary() - calculator.getReal();
        saveToDatabase(real,imaginary);
        return real + "+" + imaginary + "i";
    }

    private void saveToDatabase(double real, double imaginary) {
        try {
            mySql.save(real + "+" + imaginary + "i", real, imaginary);
        } catch (SQLException e) {
            LoggerCalc.error("Ошибка при сохранении данных в базу данных:", e);
        }
    }

}
