package com.example.bookmyshow.Book_MY_Show.Service;

import java.util.List;

import org.apache.catalina.connector.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.bookmyshow.Book_MY_Show.Dao.TheatreDao;
import com.example.bookmyshow.Book_MY_Show.Entity.Theatre;
import com.example.bookmyshow.Book_MY_Show.util.ResponseStructure;





@Service
public class TheatreService {
@Autowired
TheatreDao dao;

public ResponseEntity<ResponseStructure<Theatre>>savetheatre(Theatre theatre) {
	Theatre savetheatre=dao.saveTheatre(theatre);
	if(savetheatre!=null) {
		ResponseStructure<Theatre> structure=new ResponseStructure<Theatre>();
		structure.setData(savetheatre);
		structure.setMessage("Theatre data saved");
		structure.setStatus(HttpStatus.CREATED.value());
		
	return  new ResponseEntity<ResponseStructure<Theatre>>( structure ,HttpStatus.CREATED);
}
	return null;

}
public ResponseEntity<ResponseStructure<Theatre>> findtheatre(int id) {
	Theatre theatre =dao.findTheatreById(id);
	if(theatre!=null) {
		ResponseStructure<Theatre> structure=new ResponseStructure<Theatre>();
		structure.setData(theatre);
		structure.setMessage("theatre found in the given id");
		structure.setStatus(HttpStatus.FOUND.value());
	return new ResponseEntity<ResponseStructure<Theatre>>(structure,HttpStatus.FOUND);
}
	return null;

 
}
public ResponseEntity<ResponseStructure< Theatre>> deleteById(int id) {
	Theatre theatre=dao.findTheatreById(id);
	if(theatre!=null) {
		dao.deleteTheatreByID(id);
		ResponseStructure<Theatre> structure=new ResponseStructure<Theatre>();
		structure.setData(theatre);
		structure.setMessage("Theatreid deleted successfullly");
		structure.setStatus(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Theatre>>(structure,HttpStatus.OK);
	}
	return null;

	}
public ResponseEntity<ResponseStructure<Theatre>> updateAadhar(Theatre theatre, int id) {
	Theatre updatetheatre=dao.updateTheatre(theatre, id);
	if(updatetheatre!=null) {
		ResponseStructure<Theatre> structure=new ResponseStructure<Theatre>();
		structure.setData(updatetheatre);
		structure.setMessage("theatre updated successfully");
		structure.setStatus(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Theatre>>(structure,HttpStatus.OK); 
	}
	return null;
	

}


}





