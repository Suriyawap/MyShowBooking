package com.example.myshowbooking.entity;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

public class Seat {
  
	@Id
	private int seatid;
	private int noofseats;
	@ManyToOne(cascade = CascadeType.ALL)
	private Shows show;
}
