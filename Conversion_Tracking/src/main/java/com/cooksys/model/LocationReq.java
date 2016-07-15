package com.cooksys.model;

public class LocationReq {
 private String title;
 private long num;
public String getTitle() {
	return title;
}
public void setTitle(String title) {
	this.title = title;
}
public long getNum() {
	return num;
}
public void setNum(long num) {
	this.num = num;
}
public LocationReq() {
	super();
}
public LocationReq(String title, long num) {
	super();
	this.title = title;
	this.num = num;
}

}
