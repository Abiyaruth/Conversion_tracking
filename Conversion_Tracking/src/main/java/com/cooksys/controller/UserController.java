package com.cooksys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.entity.Users;
import com.cooksys.model.LocationReq;
import com.cooksys.model.UserReq;
//import com.cooksys.repository.UserRepository;
import com.cooksys.service.LocationService;
import com.cooksys.service.UserService;

@RestController
@RequestMapping("user")
public class UserController {
//	@Autowired
//	private UserRepository repo;
//	
	@Autowired
	private UserService userService;
	@Autowired
	private LocationService locationService;
	
	@RequestMapping(value="create",method=RequestMethod.POST)
	public Users createUser(@RequestBody UserReq requestUser) {
		locationService.addToLocation(new LocationReq(null, requestUser.getNum()), (long)1);
		return userService.createUser(requestUser);
	}
	
	@RequestMapping(value="/get",method=RequestMethod.GET)
	public List<Users> getAllUsers() {
		return userService.getAllUsers();
	}
	
	@RequestMapping(value="/{id}")
	public Users getUser(@PathVariable Long id) {
		return userService.getUserById(id);
	}
	
	@RequestMapping(value="name/{name}")
	public Users getUserByName(@PathVariable String name) {
		return userService.getUserByUsername(name);
	}
	
	@RequestMapping(value="login",method=RequestMethod.POST)
	public Users loginUser(@RequestBody UserReq requestUser) {
		locationService.addToLocation(new LocationReq(null, requestUser.getNum()), (long)-1);
		return userService.login(requestUser);
	}

}
