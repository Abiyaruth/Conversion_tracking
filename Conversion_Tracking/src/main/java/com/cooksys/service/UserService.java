package com.cooksys.service;

import java.util.List;


import com.cooksys.entity.Users;
import com.cooksys.model.UserReq;


public interface UserService {
	public Users getUserById(Long id);
	public Users getUserByUsername(String name);
	public List<Users> getAllUsers();
	public Users login(UserReq requestUser);
	public Users createUser(UserReq requestUser);
	public Users getUserByRole(String role);
}
