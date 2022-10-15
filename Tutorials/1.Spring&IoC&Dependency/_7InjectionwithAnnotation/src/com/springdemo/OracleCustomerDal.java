package com.springdemo;

public class OracleCustomerDal implements ICustomerDal {

	String connectionString; // jdbc:mysql:...
	
	public String getConnectionString() {
		return connectionString;
	}


	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}


	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("Connection string:" + this.connectionString);
		System.out.println("Added to Oracle Database!");
	}
	
}
