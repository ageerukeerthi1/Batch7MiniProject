package com.cg.project.model;

public class Policies {
	private long policyNumber;
	private float accountNumber;
	private long policyPremium;
	
	public Policies() {
	}

	public long getPolicyNumber() {
		return policyNumber;
	}

	public void setPolicyNumber(long policyNumber) {
		this.policyNumber = policyNumber;
	}

	public float getAccountNumber() {
		return accountNumber;
	}

	public void setAccountNumber(float accountNumber) {
		this.accountNumber = accountNumber;
	}

	public long getPolicyPremium() {
		return policyPremium;
	}

	public void setPolicyPremium(long policyPremium) {
		this.policyPremium = policyPremium;
	}

	@Override
	public String toString() {
		return "Policies [policyNumber=" + policyNumber + ", accountNumber=" + accountNumber + ", policyPremium="
				+ policyPremium + "]";
	}

	public Policies(long policyNumber, float accountNumber, long policyPremium) {
		super();
		this.policyNumber = policyNumber;
		this.accountNumber = accountNumber;
		this.policyPremium = policyPremium;
	}
	
	}