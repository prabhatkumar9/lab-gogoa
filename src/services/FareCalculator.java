package services;

import java.time.LocalDate;

import model.Bus;
import model.Flight;
import model.Hotel;
import model.Train;

// Type your code


public class FareCalculator extends Booking{
	
	Booking book = new Booking();
	

	public double book(Hotel hotel)
	{
		int noOfPersons=hotel.getNoOfPersons();
		String roomType =hotel.getRoomType();
		int rates=hotel.getRates();
		String occupancy=hotel.getOccupancy();
		LocalDate fromdate=hotel.getFromdate();
		LocalDate todate=hotel.getTodate();
            double d=0;
		if(todate.isAfter(fromdate))
		{
			
	      Double data1;
		
	    data1 =  book.booking(noOfPersons, rates);
	    return data1;
	      }
		else
		
	
			return d;

	}
    public double book(Flight flight) {
    	
    	int noOfPersons=flight.getNoOfPersons();
		String classType=flight.getClassType();
		int rates=flight.getRates();
		LocalDate from=flight.getFrom();
		LocalDate to=flight.getTo();
		String triptype=flight.getTriptype();
		
		double data=0;
		
		//condition check
		if(triptype=="One-way")
		{
		data =book.booking(noOfPersons, rates);
		}
		else
		{
			if(to.isAfter(from))
				data=book.booking(noOfPersons, rates);
		}
		
		return  data ; 
    	
    }
    public double book(Train train) {
    	
    	int noOfPersons=train.getNoOfPersons();
		String berth=train.getBerth();
		int rates=train.getRates();
		LocalDate date=train.getDate();
		double data =book.booking(noOfPersons, rates);
		
		return  data ;
    	
    }
    public double book(Bus bus) {
    	
    	int noOfPersons=bus.getNoOfPersons();
		String busType=bus.getBusType();
		int rates=bus.getRates();
		LocalDate date=bus.getDate();
		double data =book.booking(noOfPersons, rates);
		
		return  data ;
    }

	
}