package com.example.rjany.controller;

import java.util.List;

import com.example.rjany.model.Booking;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.example.rjany.service.BookingService;

@RestController
@CrossOrigin("http://localhost:3000/")

public class BookingController {
	
	@Autowired
	BookingService bookingService;
	
	@PostMapping("/booking")
	public Booking saveBooking(@RequestBody Booking booking) {
		return bookingService.saveBooking(booking);
	}
	
	@GetMapping("/booking/{id}")
	public Booking getBooking(@PathVariable("id") Long id) {
		return bookingService.getBookingById(id);
	}
	
	@GetMapping("/booking")
	public List<Booking> getAllBooking(){
	 	return bookingService.getAllBooking();
	}
	
	@PutMapping("/booking/{id}")
	public Booking updateBooking(@PathVariable("id") Long id, @RequestBody Booking booking) {
		return bookingService.updateBooking(id, booking);
	}
	
	@DeleteMapping("/booking/{id}")
	public String deleteBooking(@PathVariable("id") Long id) {
		return bookingService.deleteBooking(id);
	}

}
