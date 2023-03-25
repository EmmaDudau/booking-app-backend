package com.example.rjany.controller;

import com.example.rjany.model.Booking;
import com.example.rjany.model.FlightsStatus;
import com.example.rjany.service.BookingService;
import com.example.rjany.service.FlightStatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@CrossOrigin("http://localhost:3000/")

public class PublicController {

	@Autowired
	private FlightStatusService flightStatusService;

	@GetMapping("/live-arrivals")
	public List<FlightsStatus> getAllBooking(){
		FlightsStatus flightsStatus = new FlightsStatus("dddd","2022-06-07 22:34:54", "LANDED");
		return flightStatusService.getFlightStatus();
	}


}
