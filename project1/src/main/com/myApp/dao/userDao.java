package main.com.myApp.dao;

import main.com.myApp.model.User;

public interface userDao {
    public User saveUser(User user);

    public Boolean Register(User user);
}
