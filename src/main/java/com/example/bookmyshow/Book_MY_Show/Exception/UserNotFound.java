package com.example.bookmyshow.Book_MY_Show.Exception;

public class UserNotFound extends RuntimeException
{
	String message;

	public String getMessage() {
		return message;
	}

	public UserNotFound(String message) {
		this.message = message;
	}
	
	

}