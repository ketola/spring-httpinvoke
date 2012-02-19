package com.codereanimator.spring.httpinvoke.app1.service;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import org.apache.commons.collections.ListUtils;

import com.codereanimator.spring.httpinvoke.serviceinterface.ContactPerson;
import com.codereanimator.spring.httpinvoke.serviceinterface.Customer;
import com.codereanimator.spring.httpinvoke.serviceinterface.CustomerService;
import com.codereanimator.spring.httpinvoke.serviceinterface.ContactPerson.City;

public class CustomerServiceImpl implements CustomerService, Serializable {
	private List<Customer> customers;
	
	{
		customers = new ArrayList<Customer>();
		
		HashMap<Integer, Integer> purchaseMap = new HashMap<Integer, Integer>();
		purchaseMap.put(2010, 10);
		purchaseMap.put(2011, 23);
		purchaseMap.put(2012, 5);
		
		customers.add(new Customer(1L, "Sylvester Stallone", "Cobra Avenue 3, 23455, Ramboville", "555-87888", purchaseMap, new ContactPerson("Mom", City.NEW_YORK)));
		customers.add(new Customer(1L, "Chuck Norris", "Delta Force 2, 12455, Texas", "555-56568", purchaseMap, new ContactPerson("Dad", City.LONDON)));
		customers.add(new Customer(1L, "Jean Claude van Damme", "Blood Sport Street 4, 22223, Belgium", "555-7878", purchaseMap, new ContactPerson("Batman", City.PARIS)));
	}
	
	@SuppressWarnings("unchecked")
	public List<Customer> fetchAllCustomers() {
		return ListUtils.unmodifiableList(customers);
	}

	public Customer fetchCustomerById(long id) {
		for(Customer customer : customers){
			if(customer.getId().longValue() == id){
				return customer;
			}
		}
		return null;
	}

}
