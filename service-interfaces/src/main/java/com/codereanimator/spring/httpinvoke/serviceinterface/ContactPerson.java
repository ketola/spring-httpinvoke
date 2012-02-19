package com.codereanimator.spring.httpinvoke.serviceinterface;

import java.io.Serializable;

public class ContactPerson implements Serializable {
	public enum City {NEW_YORK, PARIS, LONDON};
	
	private String name;
	private City city;
	
	public ContactPerson(String name, City city) {
		super();
		this.name = name;
		this.city = city;
	}
	
	public String getName() {
		return name;
	}
	
	public City getCity() {
		return city;
	}
}
