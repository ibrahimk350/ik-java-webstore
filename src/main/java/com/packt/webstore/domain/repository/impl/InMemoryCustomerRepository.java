package com.packt.webstore.domain.repository.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.packt.webstore.domain.Customer;
import com.packt.webstore.domain.repository.CustomerRepository;

@Repository
public class InMemoryCustomerRepository implements CustomerRepository {

	private List<Customer> listOfCustomers = new ArrayList<Customer>();

	public InMemoryCustomerRepository() {
		Customer ibrahim = new Customer("300245", "Ibrahim", "Khalid", "Ibrahim Khalid");
		ibrahim.setAddress("Progress Avenue, Scarborough, ON");
		ibrahim.setNoOfOrdersMade(10);
		
		Customer eric = new Customer("300242", "Eric", "Desrochers", "Eric Desrochers");
		eric.setAddress("941 Progress Avenue, Scarborough, ON");
		eric.setNoOfOrdersMade(55);
		
		Customer patrick = new Customer("300214", "Patrick", "Cumayas", "Patrick Cumayas");
		patrick.setAddress("941 Progress Avenue, Scarborough, ON");
		patrick.setNoOfOrdersMade(5);
		
		Customer philip = new Customer("300215", "Philip", "Weekes", "Philip Weekes");
		philip.setAddress("941 Progress Avenue, Scarborough, ON");
		philip.setNoOfOrdersMade(150);
		
		Customer umair = new Customer("300216", "Umair", "Warsi", "Umair Warsi");
		umair.setAddress("941 Progress Avenue, Scarborough, ON");
		umair.setNoOfOrdersMade(70);
		
		Customer neel = new Customer("300217", "Neel", "Shah", "Neel Shah");
		neel.setAddress("941 Progress Avenue, Scarborough, ON");
		neel.setNoOfOrdersMade(80);
		
		listOfCustomers.add(ibrahim);
		listOfCustomers.add(eric);
		listOfCustomers.add(patrick);
		listOfCustomers.add(philip);
		listOfCustomers.add(umair);
		listOfCustomers.add(neel);
	}

	public List<Customer> getAllCustomers() {
		return listOfCustomers;
	}
	
	public Customer getCustomerById(String customerId) {
		Customer customerById = null;
		for (Customer customer : listOfCustomers) {
			if (customer != null && customer.getCustomerId() != null && customer.getCustomerId().equals(customerId)) {
				customerById = customer;
				break;
			}
		}
		if (customerById == null) {
			throw new IllegalArgumentException("No customer found with this id: " + customerId);
		}
		return customerById;
	}
	
}
