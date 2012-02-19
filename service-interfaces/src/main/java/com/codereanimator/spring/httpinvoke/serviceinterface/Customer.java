package com.codereanimator.spring.httpinvoke.serviceinterface;

import java.io.Serializable;
import java.util.Map;


public class Customer implements Serializable {
	
	private Long id;
	private String name;
	private String address;
	private String phone;
	private Map<Integer, Integer> yearToNumberOfPurchases;
	private ContactPerson contactPerson;
	
	public Customer(Long id, String name, String address, String phone,
			Map<Integer, Integer> yearToNumberOfPurchases,
			ContactPerson contactPerson) {
		super();
		this.id = id;
		this.name = name;
		this.address = address;
		this.phone = phone;
		this.yearToNumberOfPurchases = yearToNumberOfPurchases;
		this.contactPerson = contactPerson;
	}
	
	public int getNumberOfPurhaces(int year){
		if(yearToNumberOfPurchases.containsKey(year)){
			return yearToNumberOfPurchases.get(year);
		}
		return 0;
	}
	
	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getPhone() {
		return phone;
	}

	public ContactPerson getContactPerson() {
		return contactPerson;
	}
	
	
	
}
