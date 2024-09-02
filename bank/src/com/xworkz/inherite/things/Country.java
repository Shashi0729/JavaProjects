package com.xworkz.inherite.things;

public class Country extends Object {
	private String countryName;
	private int cid;
	private int noOfStates;
	
	public Country() {
		System.out.println("Default Constructor");
		
	}
	 
	public Country(String countryName,int cid,int noOfStates) {
		this.countryName=countryName;
		this.cid=cid;
		this.noOfStates=noOfStates;	
	}
	
	public String toString(){
		return "Country name:"+this.countryName+","+"Country Id:"+this.cid+","+"Number of States:"+this.noOfStates;
		
	}

}
