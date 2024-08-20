package com.example.myshowbooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myshowbooking.entity.Movie;

public interface Movierepo extends JpaRepository<Movie, Integer> {

}
