package com.cooksys.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Location")
public class Location {
	@Id
	@GeneratedValue
	private long id;
	@Column(name="title")
	private String title;
	@Column (name="track")
	private long track;
	@Column (name="AnnoTrack")
	private long annoTrack;
	@Column (name="area")
	private long area;
	@ManyToOne(targetEntity = Hits.class)
	@JoinColumn(name = "hits")
	Hits hits;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public long getTrack() {
		return track;
	}
	public void setTrack(long track) {
		this.track = track;
	}
	public long getAnnoTrack() {
		return annoTrack;
	}
	public void setAnnoTrack(long annoTrack) {
		this.annoTrack = annoTrack;
	}
	public long getArea() {
		return area;
	}
	public void setArea(long area) {
		this.area = area;
	}
	public Location(long id, String title, long track, long annoTrack, long area) {
		super();
		this.id = id;
		this.title = title;
		this.track = track;
		this.annoTrack = annoTrack;
		this.area = area;
	}
	public Location() {
		super();
	}
	@Override
	public String toString() {
		return "Location [id=" + id + ", title=" + title + ", track=" + track + ", annoTrack=" + annoTrack + ", area="
				+ area + ", hits=" + hits + "]";
	}
	public void setHits(Object hits) {
		
	}

}
