package com.lti.bidderRegistration.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.bidderRegistration.model.Bidder;
import com.lti.bidderRegistration.repository.BidderRepository;

@Service
@Transactional
public class BidderServiceImpl implements BidderService {

	@Autowired
	private BidderRepository bidderRepo;
	
	@Override
	public boolean addProduct(Bidder bidder) {
		bidderRepo.save(bidder);
		return true;
		
	}

	@Override
	public List<Bidder> getProducts() {
		return bidderRepo.findAll();
		
	}

}
