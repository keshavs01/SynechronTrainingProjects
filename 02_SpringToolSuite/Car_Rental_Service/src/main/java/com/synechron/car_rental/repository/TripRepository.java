package com.synechron.car_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.synechron.car_rental.entity.Trip;

@Repository
@Transactional
public interface TripRepository extends JpaRepository<Trip, Integer> {

}
