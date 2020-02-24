package com.synechron.car_rental.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synechron.car_rental.entity.Car;

@Repository
public interface CarRepository extends JpaRepository<Car, Integer> {

}
