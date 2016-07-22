package com.cooksys.service;

import java.util.List;

import com.cooksys.entity.Hits;

public interface HitsService {

	Hits decHit(String date, String label);

	List<Integer> getViews(String label, String string);

	Object getHits(String date, String label, String type);

	List<Hits> findDate(String date);

	Hits addHit(String date, String label, String type);



}
