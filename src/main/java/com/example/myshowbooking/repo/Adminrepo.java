package com.example.myshowbooking.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.myshowbooking.entity.Admin;

public interface Adminrepo extends JpaRepository<Admin, Integer>{

}
