package com.cooksys.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cooksys.entity.URL;
import com.cooksys.model.UrlResponse;
import com.cooksys.service.AdminService;
@RestController
@RequestMapping
public class AdminController {
	@Autowired
	AdminService as;
	@RequestMapping(value="/url/Createurl", method=RequestMethod.POST)
	public URL postURL(@RequestBody UrlResponse url) {
		return as.createURL(url);
	}
	@RequestMapping(value="/url/getURLs",method=RequestMethod.GET)
	public List<URL> getUrl( String baseURL, String extensionURL){
		return as.getURL(baseURL,extensionURL);
	}
	@RequestMapping("/url/getAll")
	public List<URL> getAll() {
		return as.getAll();
	}
}
