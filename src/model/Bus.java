package model;

import java.time.LocalDate;

// Type your code

public class Bus{
	

    private int noOfPersons;
    private String busType;
    private int rates;
    private LocalDate date;
    
    public Bus(int noOfPersons, int rates, String busType, LocalDate date){
    	
    	this.setNoOfPersons(noOfPersons);
    	this.setRates(rates);
    	this.setBusType(busType);
    	this.setDate(date);
    }

	public int getNoOfPersons() {
		return noOfPersons;
	}

	public void setNoOfPersons(int noOfPersons) {
		this.noOfPersons = noOfPersons;
	}

	public String getBusType() {
		return busType;
	}

	public void setBusType(String busType) {
		this.busType = busType;
	}

	public int getRates() {
		return rates;
	}

	public void setRates(int rates) {
		this.rates = rates;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	
}