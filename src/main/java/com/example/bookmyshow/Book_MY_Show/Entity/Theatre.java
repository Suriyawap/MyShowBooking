package com.example.bookmyshow.Book_MY_Show.Entity;

import java.util.List;

import org.springframework.stereotype.Component;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Positive;

@Entity
	@Component
	public class Theatre 
	{
		@Id 
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int theatreId;
		private String theatreLocation;
		
		@Positive(message = "enter a theatre Capacity")
		private int theatreCapacity;
		
		private TheatreName theatreName;
		
		@OneToMany(cascade = CascadeType.ALL)
		private List<Show> show;
		
		public TheatreName getTheatreName() {
			return theatreName;
		}
		public void setTheatreName(TheatreName theatreName) {
			this.theatreName = theatreName;
		}
		public List<Shows> getShow() {
			return show;
		}
		public void setShow(List<Shows> show) {
			this.show = show;
		}
		public int getTheatreId() {
			return theatreId;
		}
		public void setTheatreId(int theatreId) {
			this.theatreId = theatreId;
		}
		public String getTheatreLocation() {
			return theatreLocation;
		}
		public void setTheatreLocation(String theatreLocation) {
			this.theatreLocation = theatreLocation;
		}
		public int getTheatreCapacity() {
			return theatreCapacity;
		}
		public void setTheatreCapacity(int theatreCapacity) {
			this.theatreCapacity = theatreCapacity;
		}
		@Override
		public String toString() {
			return "Theatre [theatreId=" + theatreId + ", theatreLocation=" + theatreLocation + ", theatreCapacity="
					+ theatreCapacity + ", show=" + show + "]";
		}
		
		
	 
	}

