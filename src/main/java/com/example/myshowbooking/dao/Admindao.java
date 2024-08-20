package com.example.myshowbooking.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.myshowbooking.entity.Admin;
import com.example.myshowbooking.repo.Adminrepo;





@Repository
public class Admindao {

	@Autowired
	Adminrepo arepo;
	
	public Admin saveadmin(Admin a) {
		if(a!=null) {
			return arepo.save(a);
		}
		return null;
	}
	
	public Admin findadminbyid(int id) {
		Optional<Admin> oa=arepo.findById(id);
		if(oa.isPresent()) {
			return oa.get();
		}
		return null;
	}
	
	public Admin deleteadminbyid(int id) {
		Admin a=findadminbyid(id);
		if(a!=null) {
			arepo.delete(a);
			return a;
		}
		return null;
	}
	
	public Admin updateadmin(Admin a,int id) {
		Admin ad=findadminbyid(id);
		if(ad!=null) {
			a.setAdminId(id);
			return arepo.save(a);
			
		}
		return null;
	}
	
	public List<Admin> findalladmin() {
		List<Admin> findall=arepo.findAll();
		if(findall!=null) {
			return findall;
		}
		return null;
		
	}
}
