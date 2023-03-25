package com.example.rjany.service;

import java.util.List;

import com.example.rjany.model.Booking;

public interface BookingService {
	
	List<Booking> getAllBooking();
	Booking getBookingById(Long id);
	Booking saveBooking(Booking booking);
	String deleteBooking(Long id);
	Booking updateBooking(Long id, Booking student);
	

}
