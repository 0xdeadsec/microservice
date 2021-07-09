/**
 * 
 */
package com.cognizant.loan.service;

import org.springframework.stereotype.Service;

import com.cognizant.loan.model.Loan;

/**
 * @author whoami
 *
 */
@Service
public class LoanServiceImpl implements ILoanService{

	@Override
	public Loan getLoan() {
		return new Loan("H00987987972342","car",(double) 400000,(double) 3258,18);
	}

}
