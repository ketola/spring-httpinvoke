package com.codereanimator.spring.httpinvoke.serviceinterface;

import java.util.List;


public interface CustomerService {
	List<Customer> fetchAllCustomers();
	Customer fetchCustomerById(long id);
}
