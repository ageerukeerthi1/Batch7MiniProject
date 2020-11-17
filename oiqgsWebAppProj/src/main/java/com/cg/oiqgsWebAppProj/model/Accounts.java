package com.cg.oiqgsWebAppProj.model;

public class Accounts {
	private long Account_Number;
	private String Insured_Name;
	private String Insured_Street;
	private String Insured_City;
	private String Insured_State;
	private long Insured_Zip;
	private String Business_Segment;
public Accounts() {
	
}
public Accounts(long account_Number, String insured_Name, String insured_Street, String insured_City,
		String insured_State, long insured_Zip, String business_Segment) {
	super();
	Account_Number = account_Number;
	Insured_Name = insured_Name;
	Insured_Street = insured_Street;
	Insured_City = insured_City;
	Insured_State = insured_State;
	Insured_Zip = insured_Zip;
	Business_Segment = business_Segment;
}
public long getAccount_Number() {
	return Account_Number;
}
public void setAccount_Number(long account_Number) {
	Account_Number = account_Number;
}
public String getInsured_Name() {
	return Insured_Name;
}
public void setInsured_Name(String insured_Name) {
	Insured_Name = insured_Name;
}
public String getInsured_Street() {
	return Insured_Street;
}
public void setInsured_Street(String insured_Street) {
	Insured_Street = insured_Street;
}
public String getInsured_City() {
	return Insured_City;
}
public void setInsured_City(String insured_City) {
	Insured_City = insured_City;
}
public String getInsured_State() {
	return Insured_State;
}
public void setInsured_State(String insured_State) {
	Insured_State = insured_State;
}
public long getInsured_Zip() {
	return Insured_Zip;
}
public void setInsured_Zip(long insured_Zip) {
	Insured_Zip = insured_Zip;
}
public String getBusiness_Segment() {
	return Business_Segment;
}
public void setBusiness_Segment(String business_Segment) {
	Business_Segment = business_Segment;
}
@Override
public String toString() {
	return "Accounts [Account_Number=" + Account_Number + ", Insured_Name=" + Insured_Name + ", Insured_Street="
			+ Insured_Street + ", Insured_City=" + Insured_City + ", Insured_State=" + Insured_State + ", Insured_Zip="
			+ Insured_Zip + ", Business_Segment=" + Business_Segment + "]";
}

}



