package com.cooksys.service;

import java.util.List;

import com.cooksys.entity.URL;
import com.cooksys.model.UrlResponse;

public interface AdminService {

	URL createURL(UrlResponse url);

	List<URL> getURL(String baseURL, String extensionURL);

	List<URL> getAll();

}
