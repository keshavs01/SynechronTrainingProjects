package com.synechron.car_rental.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.synechron.car_rental.entity.CibilScore;
import com.synechron.car_rental.repos.CibilScoreRepository;

@Service
public class CibilScoreService {
	
	@Autowired
	private CibilScoreRepository repo;
	
	public List<CibilScore> findAll(){
		return this.repo.findAll();
	}
	
	public CibilScore add(CibilScore entity) {
		return this.repo.save(entity);
	}
	
	public CibilScore update(CibilScore entity) {
		return this.repo.save(entity);
	}
	
	public CibilScore delete(CibilScore entity) {
		if(this.repo.existsById(entity.getPanNumber())) {
			this.repo.delete(entity);
			return entity;
		} else {
			return null;
		}
		
	}
	
	public CibilScore findByPanId(String panId) {
		return this.repo.findByPanNumber(panId);
	}

}
