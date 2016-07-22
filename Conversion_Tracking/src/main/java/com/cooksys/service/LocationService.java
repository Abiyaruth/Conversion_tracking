package com.cooksys.service;

import java.util.List;

import com.cooksys.entity.Location;
import com.cooksys.entity.Users;
import com.cooksys.model.LocationReq;

public interface LocationService {

	List<Users> getAllUsersByLocation(Long id);

	Location addToLocation(LocationReq requestLocation, long n);

	List<Location> getAllLocations();

	Location getLocationById(String label);

//	Location getLocationByName(String name);

	String getConversionRateByLocation(Long id);

	Location createLocation(LocationReq requestLocation);

	Location getLocationById(Long id);


}
