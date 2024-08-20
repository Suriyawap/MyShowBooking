package com.example.myshowbooking.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.myshowbooking.entity.Movie;
import com.example.myshowbooking.repo.Movierepo;

@Repository
public class Moviedao {

	@Autowired
	Movierepo mrepo;
	
	public Movie savemovie(Movie m) {
		if(m!=null) {
			return mrepo.save(m);
		}
		return null;
	}
	
	public Movie findmoviebyid(int id) {
		Optional<Movie> oa=mrepo.findById(id);
		if(oa.isPresent()) {
			return oa.get();
		}
		return null;
	}
	
	public Movie deletemoviebyid(int id) {
		Movie m=findmoviebyid(id);
		if(m!=null) {
			mrepo.delete(m);
			return m;
		}
		return null;
	}
	
	public Movie updatemoviebyid(int id) {
		Movie m=findmoviebyid(id);
		if(m!=null) {
			m.setMovieid(id);
			return mrepo.save(m);
			
		}
		return null;
	}
	
	public List<Movie> findallmovie(){
		List<Movie> findall=mrepo.findAll();
		if(findall!=null) {
			return findall;
		}
		return null;
	}
}
