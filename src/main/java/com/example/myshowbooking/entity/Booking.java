package com.example.myshowbooking.entity;

import java.time.LocalDate;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Booking {

	@Id
	private int bookingid;
	private int noofticketsbooking;
	private double bookingprice;
	private LocalDate bookingdate;
	@ManyToOne(cascade = CascadeType.ALL)
	private User user;
	@OneToMany(cascade = CascadeType.ALL)
	private List<Ticket> tickets;
}
