/**
 * 
 */
package com.cognizant.loan.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author whoami
 *
 */

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Loan {
	
	private String number;
	private String type;
	private Double loan;
	private Double emi;
	private Integer tenure;
	
}
