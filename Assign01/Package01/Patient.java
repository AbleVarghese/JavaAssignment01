package Package01;

import java.util.Scanner;

public class Patient {

//	############################# Empty Constructor #############################
	public Patient() 
	{
		
	}
	
//	############################# Multi-argument Constructor #############################
	public Patient( int patientId,String firstName,String lastName, String address, String city, String province, String postalCode)
	{
		this.patientId=0000;
		this.firstName="";
		this.lastName="";
		this.address="";
		this.city="";
		this.province="";
		this.postalCode="";
		
		
	}
//################Instance Variables##########################	
	private int patientId;
	private String firstName;
	private String lastName;
	private String address;
	private String city;
	private String province;
	private String postalCode;
	
//########################Getters ############################
	
	public int getPatientId() {
		return patientId;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public String getAddress() {
		return address;
	}
	
	public String getCity() {
		return city;
	}
	
	public String getProvince() {
		return province;
	}
	
	public String getPostalCode() {
		return postalCode;
	}
	
	
	
//########################Setters ###########################

	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public void setCity(String city) {
		this.city = city;
	}
	
	public void setProvince(String province) {
		this.province = province;
	}
	
	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

//########################Getters ###########################
	

public void getPatientInfo()
{
	System.out.println("\nPatient Id is :"+getPatientId());
	System.out.println("\nFirst Name is :"+getFirstName());
	System.out.println("\nLast Name is :"+getLastName());
	System.out.println("\nAddress is :"+getAddress());
	System.out.println("\nCity is :"+getCity());
	System.out.println("\nProvince is :"+getProvince());
	System.out.println("\nPostalCode is :"+getPostalCode());
}
}
