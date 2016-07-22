package com.cooksys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="URL")
public class URL {
	@Id
	@GeneratedValue
	private long id;
	@Column(name="location")
    String label;
	@Column 
	String description;
	@Column(name="base_url") 
	String baseURL;
	@Column(name="extension_url") 
	Integer extensionURL;
	public URL() {
	}
	public URL(String label) {
	
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getBaseURL() {
		return baseURL;
	}
	public void setBaseURL(String baseURL) {
		this.baseURL = baseURL;
	}
	public Integer getExtensionURL() {
		return extensionURL;
	}
	public void setExtensionURL(Integer extensionURL) {
		this.extensionURL = extensionURL;
	}
	@Override
	public String toString() {
		return "URL [id=" + id + ", label=" + label + ", description=" + description + ", baseURL=" + baseURL
				+ ", extensionURL=" + extensionURL + "]";
	}
	
}
