package com.cooksys.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.cooksys.entity.URL;
import com.cooksys.model.UrlResponse;
import com.cooksys.repository.UrlRepository;
import com.cooksys.service.AdminService;
@Service
public class AdminServiceImpl implements AdminService{
@Autowired
UrlRepository urlRepo;
	@Override
	public URL createURL(UrlResponse url) {
		
//		if (url.getLabel() == null ){
//		throw new DataIntegrityViolationException("URL label cannot be null!");
//	}
//	if(urlRepo.findOneByLabel(url.getLabel()) != null) {
//		throw new DataIntegrityViolationException("URL label must be unique!");			
//	}
//	if(url.getBaseURL() == null) {
//		throw new DataIntegrityViolationException("URL baseURL cannot be null!");
//	}
	System.out.println(url);
	
	URL u = new URL();
	u.setBaseURL(url.getBaseURL());
	u.setExtensionURL(url.getExtensionURL());
	u.setDescription(url.getDescription());
	u.setLabel(url.getLabel());
   if(u!=null) {
	urlRepo.save(u);
}return u;

}
	@Override
	public List<URL> getURL(String baseURL, String extensionURL) {
		return urlRepo.findURLByBaseURLAndExtensionURL(baseURL,extensionURL);
	}
	@Override
	public List<URL> getAll() {
		return urlRepo.findAll();
	}

}
