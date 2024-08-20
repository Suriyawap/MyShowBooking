package com.example.myshowbooking.entity;

import java.time.LocalTime;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import lombok.Data;

@Entity
@Data
public class Movie {

	@Id
	private int movieid;
	private String moviename;
	private LocalTime movieduration;
	private double movierating;
	@OneToOne(cascade = CascadeType.ALL)
	private Shows show;
}
