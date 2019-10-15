package com.customerapp.model.persistance;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class UserDaoImpl implements UserDao {
	@Autowired
	private SessionFactory factory;

	public Session getSession() {
		return factory.getCurrentSession();
	}

	@SuppressWarnings("unchecked")
	@Override
	public User getUser(String email, String password) {
		List<User> users = getSession()
				.createQuery("select u from User u where u.email=:email and u.password=:password")
				.setString("email", email).setString("password", password).list();
		if (users.size() > 0)
			return users.get(0);
		else
			throw new UserNotFoundException("usewr with email" + email + "is not found");

	}

	@Override
	public void addUser(User user) {

		getSession().save(user);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<User> getAllUsers() {

		return getSession().createQuery("from User").list();
	}

}
