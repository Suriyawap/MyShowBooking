package com.example.bookmyshow.Book_MY_Show.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bookmyshow.Book_MY_Show.Entity.Show;

@Repository
	public class ShowDao 
	{
		@Autowired
		ShowRepo repo;
		
		public Show saveShow(Show show)
		{
			return repo.save(show);
		}
		
		public Show findShow(int showId)
		{
			Optional<Show> opShow = repo.findById(showId);
			if(opShow.isPresent()) {
				return opShow.get();
			}
			return null;
		}
		
		public Show deleteShow(int showId)
		{
			Show show = findShow(showId);
			repo.delete(show);
			return show;
		}
		
		public Show updateShow(Show show,int showId)
		{
			Show upShow = findShow(showId);
			if(upShow != null) {
				show.setShowId(showId);
				return repo.save(show);
			}
			return null;
		}

		

	}

