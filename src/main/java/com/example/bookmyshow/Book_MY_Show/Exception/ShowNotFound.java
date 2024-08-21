package com.example.bookmyshow.Book_MY_Show.Exception;


public class ShowNotFound extends RuntimeException
{
	String message;

	public String getMessage() {
		return message;
	}

	public ShowNotFound(String message) {
		this.message = message;
	}
	
	

}
