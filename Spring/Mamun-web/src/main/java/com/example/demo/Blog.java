package com.example.demo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Blog {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String heading;
	String body;
	public Blog() {
		super();
	}
	public Blog(int id, String heading, String body) {
		super();
		this.id = id;
		this.heading = heading;
		this.body = body;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getHeading() {
		return heading;
	}
	public void setHeading(String heading) {
		this.heading = heading;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	@Override
	public String toString() {
		return "Blog [id=" + id + ", heading=" + heading + ", body=" + body + ", getId()=" + getId() + ", getHeading()="
				+ getHeading() + ", getBody()=" + getBody() + ", getClass()=" + getClass() + ", hashCode()="
				+ hashCode() + ", toString()=" + super.toString() + "]";
	}
	

}
