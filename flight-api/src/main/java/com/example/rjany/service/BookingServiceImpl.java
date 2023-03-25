package com.example.rjany.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.rjany.model.Booking;
import com.example.rjany.repository.BookingRepository;

@Service
public class BookingServiceImpl implements BookingService {
	
	@Autowired //inject repository dependency
	BookingRepository bookingRepository;
	
	@Override
	public Booking saveBooking(Booking booking) {
		return bookingRepository.save(booking);
	}
	
	@Override
	public Booking getBookingById(Long id) {
		Optional<Booking> booking = bookingRepository.findById(id);
		if(booking.isPresent()) return booking.get();
		return null;
	}

	@Override
	public List<Booking> getAllBooking() {
		List<Booking> bookings = new ArrayList<Booking>();
		bookingRepository.findAll().forEach(booking ->bookings.add(booking));
		return bookings;
	}
	
	@Override
	public Booking updateBooking(Long id, Booking booking) {
		Optional<Booking> bookingUpdate = bookingRepository.findById(id);
		
		if(bookingUpdate.isPresent()) {
			Booking updatedBooking = bookingUpdate.get();
		
			updatedBooking.setId(booking.getId());
			updatedBooking.setDeparture(booking.getDeparture());
			updatedBooking.setArrival(booking.getArrival());
			updatedBooking.setFlyOutDate(booking.getFlyOutDate());
			updatedBooking.setFlyReturnDate(booking.getFlyReturnDate());
			
			return bookingRepository.save(updatedBooking);
		}
		
		return null;
	}

	@Override
	public String deleteBooking(Long id) {
		bookingRepository.deleteById(id);
		return "id" + id + "is deleted successfully"; 
	}
}
