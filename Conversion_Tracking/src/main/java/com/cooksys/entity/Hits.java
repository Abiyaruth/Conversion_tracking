package com.cooksys.entity;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
@Entity
@Table(name="Hits")
public class Hits {
	@Id
	@GeneratedValue
	private long id;
	@Column(name="day") 
	Integer dayOfYear;
	@Column 
	Integer year;
	@Column 
	Long anonHits;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Integer getDayOfYear() {
		return dayOfYear;
	}
	public void setDayOfYear(Integer dayOfYear) {
		this.dayOfYear = dayOfYear;
	}
	public Integer getYear() {
		return year;
	}
	public void setYear(Integer year) {
		this.year = year;
	}
	public Long getAnonHits() {
		return anonHits;
	}
	public void setAnonHits(Long anonHits) {
		this.anonHits = anonHits;
	}
	public Hits(long id, Integer dayOfYear, Integer year, Long anonHits) {
		super();
		this.id = id;
		this.dayOfYear = dayOfYear;
		this.year = year;
		this.anonHits = anonHits;
	}


}
