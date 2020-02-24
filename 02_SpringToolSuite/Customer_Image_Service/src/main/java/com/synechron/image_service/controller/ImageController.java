package com.synechron.image_service.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.synechron.image_service.entity.Image;
import com.synechron.image_service.repos.ImageRepository;

@RestController
@CrossOrigin(origins = "*")
public class ImageController {

	@Autowired
	private ImageRepository repo;

	@Autowired
	public Image defaultImage;

	@GetMapping(path = "api/v1/images/{id}")
	@HystrixCommand(fallbackMethod = "fallBackMethodForFindById")//call after exception
	public Image findById(@PathVariable("id") Long id) {
		Image image = null;
		Optional<Image> response = this.repo.findById(id);
		if (response.isPresent()) {
			image = response.get();
		} else {
			throw new RuntimeException();
		}
		return image;
	}

	//This method will be called when exception is occur
	public Image fallBackMethodForFindById(Long id) {
		return this.defaultImage;
	}

}
