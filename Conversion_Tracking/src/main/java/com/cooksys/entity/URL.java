package com.cooksys.entity;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

public class URL {
	@Id
	@GeneratedValue
	private long id;
	@Column(unique=true, nullable=false)
    String label;
	@Column 
	String description;
	@Column(name="base_url", nullable=false) 
	String baseURL;
	@Column(name="extension_url", nullable=false) 
	Integer extensionURL;
}
