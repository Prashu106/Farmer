package com.lti.bidderRegistration.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.lti.bidderRegistration.model.Bidder;


@Repository
public interface BidderRepository extends JpaRepository<Bidder, String> {

}
