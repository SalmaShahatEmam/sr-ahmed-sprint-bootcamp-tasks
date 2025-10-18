package main.com.myApp.service;

import main.com.myApp.dao.userDetailsDao;
import main.com.myApp.database.DatabaseConnectionController;
import main.com.myApp.model.UserDetails;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class userDetailsService implements userDetailsDao {

    @Autowired
    protected DatabaseConnectionController connection;

    public UserDetails save(UserDetails user)
    {
        Connection con  = this.connection.getConnection();
        String sql = "INSERT INTO user_details (role, password, city , programming_lang,os) VALUES (?, ?, ?,? ,?)";

        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, user.getRole());
            ps.setString(2, user.getPassword());
            ps.setString(3,user.getCity());
            ps.setString(4,user.getProgramming_lang());
           // ps.setString(5,user.getOs().toString());
            ps.setString(5, String.join(",", user.getOs()));

            int rows = ps.executeUpdate();
        }catch (SQLException e)
        {
            e.printStackTrace();
        }
        return user;
    }
}
