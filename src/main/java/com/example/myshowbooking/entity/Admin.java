package com.example.myshowbooking.entity;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Data;

@Entity
@Data
public class Admin {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int adminId;
    private String adminName;
    private String adminEmail;
    private String adminPassword;
    @OneToMany(cascade = CascadeType.ALL)
    private List<User> users;
    @OneToMany(cascade = CascadeType.ALL)
    private List<Theatre> theatres;
}
