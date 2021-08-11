package com.lti.bidderRegistration.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.bidderRegistration.model.Bidder;
import com.lti.bidderRegistration.service.BidderService;



@RestController
@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/bidderRest")
public class BidderController {
	
	@Autowired
	BidderService bidderService;
	
	@GetMapping("/bidder")
	public List<Bidder> getAll()
	{
		System.out.println("Get");
		return bidderService.getProducts();
		
	}
	@PostMapping("/bidder")
	public boolean addProduct(@RequestBody Bidder bidder)
	{
		System.out.println("Added");
		return bidderService.addProduct(bidder);
		
	}
	
}
