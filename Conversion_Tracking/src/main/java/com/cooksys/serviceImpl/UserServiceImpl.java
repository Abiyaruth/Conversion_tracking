package com.cooksys.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cooksys.entity.Users;
import com.cooksys.model.UserReq;
import com.cooksys.repository.LocationRespository;
import com.cooksys.repository.UserRepository;
import com.cooksys.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserRepository userRepo;
	@Autowired
	LocationRespository locRepo;

	@Override
	public Users getUserById(Long id) {
		return userRepo.findOne(id);
	}

	@Override
	public Users getUserByUsername(String name) {
		return userRepo.findByUsername(name);
	}

	@Override
	public List<Users> getAllUsers() {
		return userRepo.findAll();
	}

	@Override
	public Users login(UserReq requestUser) {
		Users onFile = getUserByUsername(requestUser.getUsername());
		Users toLogin = new Users();
		toLogin.setUsername(requestUser.getUsername());
		toLogin.setPassword(requestUser.getPassword());
		
		if (verifyUser(toLogin, onFile)) {
			return onFile;
		}
		
		return null;
	}

	@Override
	public Users createUser(UserReq requestUser) {
		Users user = checkExisting(requestUser);
		if (user != null) {
			userRepo.save(user);
		}
		return user;
	}
	
	private Users checkExisting(UserReq requestUser) {
		Users existing = getUserByUsername(requestUser.getUsername());
		
		if (existing == null) {
			Users user = new Users();
			user.setUsername(requestUser.getUsername());
			user.setPassword(requestUser.getPassword());
			user.setNum(requestUser.getNum());
			return user;
		}
		
		return null;
	}
	
	private boolean verifyUser(Users toLogin, Users onFile) {
		if (toLogin == null || onFile == null)
			return false;
		return (toLogin.getUsername().equals(onFile.getUsername()) && toLogin.getPassword().equals(onFile.getPassword()));
	}

}
