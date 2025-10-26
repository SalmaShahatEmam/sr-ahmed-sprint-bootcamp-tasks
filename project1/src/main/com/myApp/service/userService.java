package main.com.myApp.service;


import main.com.myApp.dao.userDao;
import main.com.myApp.database.DatabaseConnectionController;
import main.com.myApp.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class userService implements userDao {
    @Autowired
  protected  DatabaseConnectionController connection;

    public User saveUser(User user)
    {
       // DatabaseConnectionController connection = new DatabaseConnectionController();
        Connection con  = this.connection.getConnection();
        String sql = "INSERT INTO user (first_name, last_name, email , date,city) VALUES (?, ?, ?,? ,?)";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3,user.getEmail());
            ps.setDate(4,user.getDate_of_birth());
            ps.setString(5,user.getCity());

            int rows = ps.executeUpdate();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return user;
    }


    public Boolean Register(User user)
    {
        Connection con  = this.connection.getConnection();
        String sql = "INSERT INTO user (first_name, last_name, email , password) VALUES (?, ?, ?,?)";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getFirstName());
            ps.setString(2, user.getLastName());
            ps.setString(3,user.getEmail());

            ps.setString(4,user.getPassword());

            int rows = ps.executeUpdate();
        }catch (SQLException e)
        {
            e.printStackTrace();
            return false;
        }
        return true;
    }
}
