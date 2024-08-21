package com.example.bookmyshow.Book_MY_Show.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bookmyshow.Book_MY_Show.Entity.Theatre;




@Repository
public class TheatreDao 
{
	@Autowired
	TheatreRepo repo;
	
	public Theatre saveTheatre(Theatre theatre)
	{
		return repo.save(theatre);
	}
	
	public Theatre findTheatreById(int theatreId)
	{
		Optional<Theatre> optTheatre = repo.findById(theatreId);
		if(optTheatre.isPresent()) {
			return optTheatre.get();
		}
		return null;
	}
	
	public Theatre deleteTheatreByID(int theatreId)
	{
		Theatre theatre = findTheatreById(theatreId);
		if(theatre!=null) {
			 repo.delete(theatre);
			 return theatre;
		 }
		return null;
	}
	
	public Theatre updateTheatre(Theatre theatre,int theatreId)
	{
		Theatre upTheatre = findTheatreById(theatreId);
		if(upTheatre != null) {
			theatre.setTheatreId(theatreId);
			return repo.save(theatre);
		}
		return null;
	}
	 
	 }


