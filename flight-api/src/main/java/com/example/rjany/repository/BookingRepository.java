package com.example.rjany.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.rjany.model.Booking;

public interface BookingRepository extends CrudRepository<Booking, Long> {

}
