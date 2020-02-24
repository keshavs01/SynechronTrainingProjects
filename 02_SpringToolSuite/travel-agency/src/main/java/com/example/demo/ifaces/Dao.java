package com.example.demo.ifaces;

import java.util.List;
import java.util.Map;

import com.example.demo.entity.Payment;
import com.example.demo.entity.Tour;

public interface Dao<T> {
	
	List<Map<String,Object>> findAll();
	
	long add(T t);
	
	long remove(T r);
	
	long update(Tour t);

	long addPayment(Payment p);
	

}
