package com.example.rjany.model;

import javax.persistence.*;
import java.time.LocalDate;

@Entity //mark class as entity
@Table //defining class name as Table name
public class Booking {
	
	@Column //defining id as primary key
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Long id;
	
	@Column 
	private String departure;

	@Column
	private String arrival;

	@Column(name="flyout")
    private LocalDate flyOutDate;

	@Column(name="returndate")
	private LocalDate flyReturnDate;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getDeparture() {
		return departure;
	}

	public void setDeparture(String departure) {
		this.departure = departure;
	}

	public String getArrival() {
		return arrival;
	}

	public void setArrival(String arrival) {
		this.arrival = arrival;
	}

	public LocalDate getFlyOutDate() {
		return flyOutDate;
	}

	public void setFlyOutDate(LocalDate flyOutDate) {
		this.flyOutDate = flyOutDate;
	}

	public LocalDate getFlyReturnDate() {
		return flyReturnDate;
	}

	public void setFlyReturnDate(LocalDate flyReturnDate) {
		this.flyReturnDate = flyReturnDate;
	}
}
