// Honor Pledge:
//
// I pledge that I have neither given nor 
// received any help on this assignment.
//
// banspate

import java.util.Scanner;

public class Address{
	
	private String address1;
	private String address2;
	private String city;
	private String state;
	private String zipCode;
	String[] information1 = new String[9];
	
	//default constructor
	public Address(){
		
	
	}
	//overloaded constructor
	public Address( String address1, String address2, String city, String state, String zipCode ){
		
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		
	}
	//method 1 indicates what part of the text file is the student address information
	public Address(String[] information1){
		if( information1[8] == null ){
			this.address1 = information1[2]; 
			this.city = information1[3];
			this.state = information1[4]; 
			this.zipCode = information1[5];
		}else{
			this.address1 = information1[2];
			this.address2 = information1[3];
			this.city = information1[4];
			this.state = information1[5]; 
			this.zipCode = information1[6];
		}
		
	}
	//getter method for address1
	public String getAddress1(){
	
		return this.address1;
		
	}
	//getter method for address2
	public String getAddress2(){
		
		return this.address2;
		
	}
	//getter method for city
	public String getCity(){
		
		return this.city;
		
	}
	//getter method for state
	public String getState(){
		
		return this.state;
		
	}
	//getter method for zip code
	public String getZipCode(){
		
		return this.zipCode;
		
	}
	
	
	//check if all the 
	public String checkNullValues(){
		
		return "Address: " + this.address1 + " " + this.address2 +  " " + this.city + " " + this.state + " " + this.zipCode + "\t\t";
				
	}	
	
}