package com.cts.training.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * Loan Enity Class
 */
@Entity
@Table(name = "loan")
@Getter
@Setter
@NoArgsConstructor
@ApiModel(description = "Model Class for the Loan Details")
public class Loan {

	@Id
	@GeneratedValue
	@ApiModelProperty(value = "Id of LoanProduct")
	private Integer loanProductId;

	@ApiModelProperty(value = "Name of LoanProduct")
	private String loanProductName;

	@ApiModelProperty(value = "Maximum amount of Loan Eligible for particular LoanProduct")
	private Double maxLoanEligible;

	@ApiModelProperty(value = "Interest on LoanProduct")
	private Double interestRate;

	@ApiModelProperty(value = "Tenure of LoanProduct")
	private Integer tenure;

	@ApiModelProperty(value = "Type of Collateral")
	private String collateralType;

}
