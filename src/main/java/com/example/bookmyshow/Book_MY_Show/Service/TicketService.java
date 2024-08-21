package com.example.bookmyshow.Book_MY_Show.Service;



import java.util.List;

import org.apache.catalina.connector.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.bookmyshow.Book_MY_Show.Dao.TicketDao;
import com.example.bookmyshow.Book_MY_Show.Entity.Ticket;
import com.example.bookmyshow.Book_MY_Show.util.ResponseStructure;





@Service
public class TicketService {
@Autowired
TicketDao dao;

public ResponseEntity<ResponseStructure<Ticket>>saveadhar(Ticket ticket) {
	Ticket saveticket=dao.saveTicket(ticket);
	if(saveticket!=null) {
		ResponseStructure<Ticket> structure=new ResponseStructure<Ticket>();
		structure.setData(saveticket);
		structure.setMessage(" Ticket a data saved");
		structure.setStatus(HttpStatus.CREATED.value());
		
	return  new ResponseEntity<ResponseStructure<Ticket>>( structure ,HttpStatus.CREATED);
}
	return null;

}
public ResponseEntity<ResponseStructure<Ticket>> findaadhar(int id) {
	Ticket ticket =dao.findTicketById(id);
	if(ticket!=null) {
		ResponseStructure<Ticket> structure=new ResponseStructure<Ticket>();
		structure.setData(ticket);
		structure.setMessage("Ticket found in the given id");
		structure.setStatus(HttpStatus.FOUND.value());
	return new ResponseEntity<ResponseStructure<Ticket>>(structure,HttpStatus.FOUND);
}
	return null;

 
}
public ResponseEntity<ResponseStructure< Ticket>> deleteById(int id) {
	Ticket ticket=dao.findTicketById(id);
	if(ticket!=null) {
		dao.deleteTicketByID(id);
		ResponseStructure<Ticket> structure=new ResponseStructure<Ticket>();
		structure.setData(ticket);
		structure.setMessage("Ticket deleted successfullly");
		structure.setStatus(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Ticket>>(structure,HttpStatus.OK);
	}
	return null;

	}
public ResponseEntity<ResponseStructure<Ticket>> updateAadhar(Ticket ticket, int id) {
	Ticket updateticket=dao.updateTicket(ticket, id);
	if(updateticket!=null) {
		ResponseStructure<Ticket> structure=new ResponseStructure<Ticket>();
		structure.setData(updateticket);
		structure.setMessage("Ticket updated successfully");
		structure.setStatus(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Ticket>>(structure,HttpStatus.OK); 
	}
	return null;
	

}


}




