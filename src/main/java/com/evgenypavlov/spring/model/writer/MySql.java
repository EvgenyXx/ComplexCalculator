package com.evgenypavlov.spring.model.writer;

import com.evgenypavlov.spring.model.connection_patter.ConnectorMySQL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class MySql {
    private ConnectorMySQL connectorMySQL = ConnectorMySQL.getINSTANCE();


    public void save(String res,double f,double s) throws SQLException {
        Connection connection = connectorMySQL.getConnection();
        PreparedStatement statement = connection.prepareStatement(
                "insert into result(result,firstN,secondN) values (?,?,?)");
        statement.setString(1, res);
        statement.setDouble(2,f);
        statement.setDouble(3,s);

        if (statement.executeUpdate()>0){
            System.out.println("добавленно в бд");
        }
    }

}
