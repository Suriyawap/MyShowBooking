package com.example.bookmyshow.Book_MY_Show.Dao;



import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bookmyshow.Book_MY_Show.Entity.Theatre;
import com.example.bookmyshow.Book_MY_Show.Entity.Ticket;




@Repository
public class TicketDao 
{
	@Autowired
	TicketeRepo repo;
	
	public Ticket saveTicket(Ticket ticket)
	{
		return repo.save(ticket);
	}
	
	public Ticket findTicketById(int ticketId)
	{
		Optional<Ticket> optTicket = repo.findById(ticketId);
		if(optTicket.isPresent()) {
			return optTicket.get();
		}
		return null;
	}
	
	public Ticket deleteTicketByID(int ticketId)
	{
		Ticket ticket = findTicketById(ticketId);
		if(ticket!=null) {
			 repo.delete(ticket);
			 return ticket;
		 }
		return null;
	}
	
	public Ticket updateTicket(Ticket ticket,int ticketId)
	{
		Ticket upticket = findTicketById(ticketId);
		if(upticket != null) {
			upticket.setTicketId(ticketId);
			return repo.save(ticket);
		}
		return null;
	}
	 
	 }
