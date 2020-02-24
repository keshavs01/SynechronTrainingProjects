package com.synechron.car_rental.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.synechron.car_rental.entity.Driver;

@Repository
public interface DriverRepository extends JpaRepository<Driver, Integer> {

	public List<Driver> findByCityContaining(String city);
}
