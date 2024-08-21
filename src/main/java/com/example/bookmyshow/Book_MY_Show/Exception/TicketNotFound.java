package com.example.bookmyshow.Book_MY_Show.Exception;

public class TicketNotFound extends RuntimeException
{
	String message;

	public String getMessage() {
		return message;
	}

	public TicketNotFound(String message) {
		this.message = message;
	}
	
	

}