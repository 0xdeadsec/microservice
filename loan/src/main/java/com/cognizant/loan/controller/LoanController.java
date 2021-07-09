/**
 * 
 */
package com.cognizant.loan.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.loan.model.Loan;
import com.cognizant.loan.service.ILoanService;

/**
 * @author whoami
 *
 */
@RestController
public class LoanController {
	
	@Autowired
	private ILoanService lservice;
	
	
	/*
	 * http://127.0.0.1:8081/loans/1
	 */
	@GetMapping(value = "/loans/{number}")
	public ResponseEntity<Loan> getLoanDetails() {
		Loan obj = lservice.getLoan();
		return new ResponseEntity<Loan>(obj,HttpStatus.OK);
	}
}
