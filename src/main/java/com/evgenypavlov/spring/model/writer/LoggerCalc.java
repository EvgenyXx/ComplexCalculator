package com.evgenypavlov.spring.model.writer;

import java.sql.SQLException;
import java.util.logging.Logger;

public class LoggerCalc {
    private static final Logger LOGGER = Logger.getLogger(Logger.class.getName());

    public static void info(String message) {
        LOGGER.info(message);
    }


    public static void error(String s, SQLException e) {
    }
}
