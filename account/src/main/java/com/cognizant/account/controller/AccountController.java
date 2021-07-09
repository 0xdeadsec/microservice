/**
 * 
 */
package com.cognizant.account.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.cognizant.account.model.Account;
import com.cognizant.account.service.IAccountService;

/**
 * @author whoami
 *
 */
@RestController
public class AccountController {
	
	@Autowired
	private IAccountService aservice;
	
	/*
	 * http://localhost:8080/account/1
	 */
	@GetMapping(value = "/account/{number}")
	public ResponseEntity<Account> getAccountDetails(@PathVariable Integer number){
		Account obj = aservice.getAccount();
		return new ResponseEntity<Account>(obj,HttpStatus.OK);
	}
}
