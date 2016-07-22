package com.cooksys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.entity.URL;



public interface UrlRepository extends JpaRepository<URL,Long>{

	URL findOneByLabel(String label);

	List<URL> findURLByBaseURLAndExtensionURL(String baseURL, String extensionURL);

	 URL findByExtensionURL(String label); 




}
