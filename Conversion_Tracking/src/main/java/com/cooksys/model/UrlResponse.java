package com.cooksys.model;

public class UrlResponse {
	String label;
	String description;
	String baseURL;
	Integer extensionURL;
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
		return "UrlResponse [label=" + label + ", description=" + description + ", baseURL=" + baseURL
				+ ", extensionURL=" + extensionURL + "]";
	}

}
