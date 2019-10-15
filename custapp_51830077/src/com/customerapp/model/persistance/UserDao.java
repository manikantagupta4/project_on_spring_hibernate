package com.customerapp.model.persistance;

import java.util.List;

public interface UserDao {
public User getUser(String email,String password);
public void addUser(User user);
public List<User> getAllUsers();

}
