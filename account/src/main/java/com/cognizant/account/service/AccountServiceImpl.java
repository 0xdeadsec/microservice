/**
 * 
 */
package com.cognizant.account.service;

import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

import com.cognizant.account.model.Account;

/**
 * @author whoami
 *
 */
@Service
public class AccountServiceImpl implements IAccountService{

	@Override
	public Account getAccount() {
		return new Account("00987987973432","savings",(double) 234343);
	}
}
