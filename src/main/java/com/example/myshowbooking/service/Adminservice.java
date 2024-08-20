package com.example.myshowbooking.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.example.myshowbooking.dao.Admindao;
import com.example.myshowbooking.entity.Admin;
import com.example.myshowbooking.util.ResponseStructure;




@Service
public class Adminservice {

	@Autowired
	Admindao adao;
	
	public ResponseEntity<ResponseStructure<Admin>> saveadhar(Admin a) {
		Admin saveadmin=adao.saveadmin(a);
		if(saveadmin!=null) {
			ResponseStructure<Admin> structure=new ResponseStructure<Admin>();
			structure.setData(saveadmin);
			structure.setMessage("Admin saved");
			structure.setStatus(HttpStatus.CREATED.value());
			return new ResponseEntity<ResponseStructure<Admin>>(structure,HttpStatus.CREATED);
		}
		return null;
	}
	
	public  ResponseEntity<ResponseStructure<Admin>> findadminbyid(int id) {
		Admin findadminbyid=adao.findadminbyid(id);
		if(findadminbyid!=null) {
			ResponseStructure<Admin> structure=new ResponseStructure<Admin>();
			structure.setData(findadminbyid);
			structure.setMessage("Found Admin based on id");
			structure.setStatus(HttpStatus.FOUND.value());
			return new ResponseEntity<ResponseStructure<Admin>>(structure,HttpStatus.FOUND);
		}
		return null;
	}
	
	public ResponseEntity<ResponseStructure<Admin>> deletebyid(int id) {
		Admin deleteadminbyid=adao.deleteadminbyid(id);
		if(deleteadminbyid!=null) {
			ResponseStructure<Admin> structure=new ResponseStructure<Admin>();
			structure.setData(deleteadminbyid);
			structure.setMessage("Delete Admin based on id");
			structure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Admin>>(structure,HttpStatus.OK);
		}
		return null;
	}
	
	public ResponseEntity<ResponseStructure<Admin>> updateaadhar(Admin a,int id) {
		Admin updateadmin=adao.updateadmin(a, id);
		if(updateadmin!=null) {
			ResponseStructure<Admin> structure=new ResponseStructure<Admin>();
			structure.setData(updateadmin);
			structure.setMessage("Update Admin based on id");
			structure.setStatus(HttpStatus.OK.value());
			return new ResponseEntity<ResponseStructure<Admin>>(structure,HttpStatus.OK);
		}
		return null;
	}
	
	public  ResponseEntity<ResponseStructure<List<Admin>>> findalladmin(){
		List<Admin> findall=adao.findalladmin();
		ResponseStructure<List<Admin>> structure=new ResponseStructure<List<Admin>>();;
		structure.setData(findall);
		structure.setMessage("data found for all Admin");
		structure.setStatus(HttpStatus.FOUND.value());
		return new ResponseEntity<ResponseStructure<List<Admin>>>(structure,HttpStatus.FOUND);
	}
}
