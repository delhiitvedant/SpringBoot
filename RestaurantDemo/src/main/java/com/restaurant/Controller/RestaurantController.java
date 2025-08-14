package com.restaurant.Controller;

import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurant.DTO.RestaurantDTO;
import com.restaurant.Service.RestaurantService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/restaurants")
@CrossOrigin("*")
public class RestaurantController {

	RestaurantService service;

	public RestaurantController(RestaurantService service) {
		super();
		this.service = service;
	}
	@PostMapping
	public ResponseEntity<RestaurantDTO> createRestaurant(@Valid @RequestBody RestaurantDTO dto)
	{
		
		return ResponseEntity.ok(service.createRestaurant(dto));
	}
	@GetMapping
	public ResponseEntity<List<RestaurantDTO>> getAllRestaurant()
	{
		return ResponseEntity.ok(service.getAllRestaurants());
	}
	
	
	
}
