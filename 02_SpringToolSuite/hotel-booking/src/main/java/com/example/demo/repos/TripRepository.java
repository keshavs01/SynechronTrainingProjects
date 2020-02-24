package com.example.demo.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Trip;

public interface TripRepository extends JpaRepository<Trip, Long> {
	

}
