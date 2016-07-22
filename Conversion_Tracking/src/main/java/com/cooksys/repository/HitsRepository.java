package com.cooksys.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cooksys.entity.Hits;
import com.cooksys.entity.URL;


public interface HitsRepository extends JpaRepository<Hits,Long> {

	Hits findById(Long id);

	List<Hits> findByDate(String date);

	List<Hits> findBottom7ByExtensionURL(URL label);

	List<Hits> findBottom30ByExtensionURL(URL label);
	
	List<Hits> findAllByExtensionURL(URL label);
	
	List<Hits> findBottom1ByExtensionURL(URL label);

	Hits findByExtensionURL(URL label);


}
