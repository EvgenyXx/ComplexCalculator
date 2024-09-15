package com.evgenypavlov.spring.model.connection_patter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectorMySQL {
    private static ConnectorMySQL INSTANCE = new ConnectorMySQL();
    private static Connection connection;

    private ConnectorMySQL(){
        try {
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/calc","root","Evgeny24");
            System.out.println("подключение к бд");
        }catch (SQLException e){
            System.out.println("что то пошло не так");
        }
    }

    public static ConnectorMySQL getINSTANCE(){
        return INSTANCE;
    }

    public Connection getConnection(){
        return connection;
    }
}
