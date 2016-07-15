package com.cooksys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.entity.Location;
import com.cooksys.entity.Users;
import com.cooksys.model.LocationReq;
//import com.cooksys.repository.LocationRespository;
import com.cooksys.service.LocationService;

@RestController
@RequestMapping("location")
public class LocationController {
// @Autowired
// private LocationRespository repo;
 @Autowired
 private LocationService ser;
 @RequestMapping(value="/LocCreate",method=RequestMethod.POST)
	public Location createLocation(@RequestBody LocationReq requestLocation) {
		return ser.addToLocation(requestLocation, (long)1);
	}
	
	@RequestMapping(value="/getLoc",method=RequestMethod.GET)
	public List<Location> getAllLocations() {
		return ser.getAllLocations();
	}
	
	@RequestMapping(value="/{id}")
	public Location getLocation(@PathVariable Long id) {
		return ser.getLocationById(id);
	}
	
//	@RequestMapping(value="name/{name}")
//	public Location getLocationByName(@PathVariable String name) {
//		return ser.getLocationByName(name);
//	}
	
	@RequestMapping(value="users/{id}")
	public List<Users> getUsersByLocation(@PathVariable Long id) {
		return ser.getAllUsersByLocation(id);
	}
	
	@RequestMapping(value="conversion/{id}")
	public String getLocationConversion(@PathVariable Long id) {
		return ser.getConversionRateByLocation(id);
	}
}
