package com.example.bookmyshow.Book_MY_Show.Exception;


	public class TheatreNotFound extends RuntimeException 
	{
		String message;

		public String getMessage() {
			return message;
		}

		public TheatreNotFound(String message) {
			this.message = message;
		}
		
		

	}

