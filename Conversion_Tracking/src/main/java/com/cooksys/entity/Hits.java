package com.cooksys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;



@Entity
@Table(name = "hits")
public class Hits {
	@Id
	@GeneratedValue
	Long id;

	@Column(name = "date")
	String date = "";

	@Column(name = "totalHits")
	Integer totalHits = 0;
	
	@Column(name = "anonymousHits")
	Integer anonymousHits = 0;
	
	@Column(name = "convertedHit")
	Integer convertedHits = 0;

	@Column(name = "totalSignups")
	Integer totalSignups = 0;

	@ManyToOne(targetEntity = URL.class)
	@JoinColumn(name = "num")
	URL extensionURL;

	public Hits(String date, Integer totalHits) {
		super();
		this.date = date;
		this.totalHits = totalHits;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public Integer getTotalHits() {
		return totalHits;
	}

	public void setTotalHits(Integer totalHits) {
		this.totalHits = totalHits;
	}

	public Hits(Long id, String date, Integer totalHits) {
		super();
		this.id = id;
		this.date = date;
		this.totalHits = totalHits;
	}

	public Hits() {
		super();
	}

	public Hits(Long id, String date, Integer totalHits, URL extensionURL) {
		super();
		this.id = id;
		this.date = date;
		this.totalHits = totalHits;
		this.extensionURL = extensionURL;
	}

	

	public URL getExtensionURL() {
		return extensionURL;
	}

	public void setExtensionURL(URL extensionURL) {
		this.extensionURL = extensionURL;
	}

	public Hits(String date, Integer totalHits, URL extensionURL) {
		super();
		this.date = date;
		this.totalHits = totalHits;
		this.extensionURL = extensionURL;
	}

	public Hits(Long id, String date, Integer totalHits, Integer totalSignups, URL extensionURL) {
		super();
		this.id = id;
		this.date = date;
		this.totalHits = totalHits;
		this.totalSignups = totalSignups;
		this.extensionURL = extensionURL;
	}

	public Integer getTotalSignups() {
		return totalSignups;
	}

	public void setTotalSignups(Integer totalSignups) {
		this.totalSignups = totalSignups;
	}

	public Hits(String date, Integer totalHits, Integer totalSignups, URL extensionURL) {
		super();
		this.date = date;
		this.totalHits = totalHits;
		this.totalSignups = totalSignups;
		this.extensionURL = extensionURL;
	}

	
	
	public Integer getAnonymousHits() {
		return anonymousHits;
	}

	public void setAnonymousHits(Integer anonymousHits) {
		this.anonymousHits = anonymousHits;
	}

	public Integer getConvertedHits() {
		return convertedHits;
	}

	public void setConvertedHits(Integer convertedHits) {
		this.convertedHits = convertedHits;
	}

	public Hits(String date, Integer totalHits, Integer anonymousHits, Integer convertedHits, Integer totalSignups,
			URL extensionURL) {
		super();
		this.date = date;
		this.totalHits = totalHits;
		this.anonymousHits = anonymousHits;
		this.convertedHits = convertedHits;
		this.totalSignups = totalSignups;
		this.extensionURL = extensionURL;
	}

	@Override
	public String toString() {
		return "Hits [id=" + id + ", date=" + date + ", totalHits=" + totalHits + ", totalSignups=" + totalSignups
				+ ", extensionURL=" + extensionURL + "]";
	}

	public Hits(Integer totalHits, Integer anonymousHits, Integer convertedHits, Integer totalSignups) {
		super();
		this.totalHits = totalHits;
		this.anonymousHits = anonymousHits;
		this.convertedHits = convertedHits;
		this.totalSignups = totalSignups;
	}

	public Hits(int i, String date, Object n) {
		
	}
	
	
}