package com.customerapp.model.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.customerapp.model.persistance.User;
import com.customerapp.model.persistance.UserDao;
@Service
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
private UserDao userDao;
	@Override
	public User getUser(String email, String password) {
		
		return userDao.getUser(email, password);
	}

	@Override
	public void addUser(User user) {
		userDao.addUser(user);
		
	}

	@Override
	public List<User> getAllUsers() {
		// TODO Auto-generated method stub
		return userDao.getAllUsers();
	}

}
