package com.myproj.dao;

import com.myproj.model.User;

public interface UserDao {

	void registration(User user);

	boolean isEmailValid(String email);

	User login(User user);

	void update(User user);

	User getUser(String email);
}