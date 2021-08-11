package com.lti.bidderRegistration.service;

import java.util.List;

import com.lti.bidderRegistration.model.Bidder;


public interface BidderService {
	
	public boolean addProduct(Bidder bidder);

	public List<Bidder> getProducts();
}
