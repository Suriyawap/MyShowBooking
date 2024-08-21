package com.example.bookmyshow.Book_MY_Show.Service;

import java.util.List;

import org.apache.catalina.connector.Response;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.bookmyshow.Book_MY_Show.Dao.ShowDao;
import com.example.bookmyshow.Book_MY_Show.Entity.Show;
import com.example.bookmyshow.Book_MY_Show.util.ResponseStructure;

@Service
public class ShowService {
@Autowired
ShowDao dao;


public ResponseEntity<ResponseStructure<Show>>saveShow(Show show) {
	Show saveShow=dao.saveShow(show);
	if(saveShow!=null) {
		ResponseStructure<Show> structure=new ResponseStructure<Show>();
		structure.setData(saveShow);
		structure.setMessage("Show data saved");
		structure.setStatus(HttpStatus.CREATED.value());
		
	return  new ResponseEntity<ResponseStructure<Show>>( structure ,HttpStatus.CREATED);
}
	return null;

}
public ResponseEntity<ResponseStructure<Show>> findShow(int id) {
	Show show =dao.findShow(id);
	if(show!=null) {
		ResponseStructure<Show> structure=new ResponseStructure<Show>();
		structure.setData(show);
		structure.setMessage("Show found in the given id");
		structure.setStatus(HttpStatus.FOUND.value());
	return new ResponseEntity<ResponseStructure<Show>>(structure,HttpStatus.FOUND);
}
	return null;

 
}
public ResponseEntity<ResponseStructure< Show>> deleteById(int id) {
	Show show=dao.findShow(id);
	if(show!=null) {
		dao.deleteShow(id);
		ResponseStructure<Show> structure=new ResponseStructure<Show>();
		structure.setData(show);
		structure.setMessage("Show deleted successfullly");
		structure.setStatus(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Show>>(structure,HttpStatus.OK);
	}
	return null;
}
	
public ResponseEntity<ResponseStructure<Show>> updateShow(Show show, int id) {
	Show updateshow=dao.updateShow(show, id);
	if(updateshow!=null) {
		ResponseStructure<Show> structure=new ResponseStructure<Show>();
		structure.setData(updateshow);
		structure.setMessage("Show updated successfully");
		structure.setStatus(HttpStatus.OK.value());
		return new ResponseEntity<ResponseStructure<Show>>(structure,HttpStatus.OK); 
	}
	return null;
}}