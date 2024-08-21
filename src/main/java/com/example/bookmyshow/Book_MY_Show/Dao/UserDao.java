package com.example.bookmyshow.Book_MY_Show.Dao;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.bookmyshow.Book_MY_Show.Entity.User;




	@Repository
	public class UserDao {
		 @Autowired
		 UserRepo repo;
		
		 public User saveUser(User user) {
			 if(user!=null) {
				return repo.save(user);
		 }
				return null;
			}
			
		 public User findUserById(int id) {
			 Optional<User> user=repo.findById(id);{
				 if(user.isPresent()) {
					 return user.get();
				 }
				 return null;
			 }
			 
		 }
		 public User deleteById(int id) {
			 User user=findUserById(id);
			 if(user!=null) {
				 repo.delete(user);
				 return user;
			 }
			return null;
			 
		 }
		 public User UpdateUser( int id,User user) {
			 User upuser=findUserById(id);{
				 if(upuser!=null){
					 user.setUserId(id);
					 return repo.save(user);
				 }
				 return null;
			 }
			
			 
			 }
}
