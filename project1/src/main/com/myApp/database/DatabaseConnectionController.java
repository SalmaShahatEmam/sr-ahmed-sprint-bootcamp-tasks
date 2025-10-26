package main.com.myApp.database;


import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

@Component
@Data
public class DatabaseConnectionController {

    Connection connection;

    public String url;


    public String username;


    public String password;

    public DatabaseConnectionController() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/java", "root", "");

            if ( this.connection != null) {
                System.out.println("Connected to the database successfully!");
            }
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
            System.out.println("MySQL Driver not found.");
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Connection failed!");
        }

    }

}
