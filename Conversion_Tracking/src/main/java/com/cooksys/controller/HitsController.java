package com.cooksys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.entity.Hits;
import com.cooksys.entity.Location;
import com.cooksys.service.HitsService;
import com.cooksys.service.LocationService;

@RestController
@RequestMapping("number/")
public class HitsController {
	@Autowired
	HitsService hitService;
	
	@RequestMapping(value = "addHit/{date}/{location}/{type}", method = RequestMethod.GET)
	public Hits addHit(@PathVariable String date, @PathVariable String label, @PathVariable String type) {
		return hitService.addHit(date, label, type);
	}
	@Autowired
	LocationService locationService;
	@RequestMapping(value = "decHit/{date}/{location}", method = RequestMethod.GET)
	public Hits addHit(@PathVariable String date, @PathVariable String label) {
		return hitService.decHit(date, label);
	}
	
	@RequestMapping(value = "getViewsHits/{location}", method = RequestMethod.GET)
	public List<Integer> getLoginHits( @PathVariable String label) {
		return hitService.getViews(label, "anon");
	}
	
	@RequestMapping(value = "getConvertedHits/{location}", method = RequestMethod.GET)
	public List<Integer> getConvertedHits( @PathVariable String label) {
		return hitService.getViews(label, "conv");
	}

	
	@RequestMapping(value = "getAllHits/{date}/{location}/{type}", method = RequestMethod.GET)
	public Location getConvTotalHits(@PathVariable String date, @PathVariable String label, @PathVariable String type) {
		Location locToReturn = locationService.getLocationById(label);
		locToReturn.setHits(hitService.getHits(date, label, type));
		return locToReturn;
	}
}
