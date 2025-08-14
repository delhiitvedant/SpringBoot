package com.restaurant.Service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.restaurant.DTO.RestaurantDTO;
import com.restaurant.Entity.Restaurant;
import com.restaurant.Repo.RestaurantRepo;

@Service
public class RestaurantService {
	RestaurantRepo repo;

	public RestaurantService(RestaurantRepo repo) {
		super();
		this.repo = repo;
	}
	// entity to dto

private RestaurantDTO toDto(Restaurant savedRestaurant)
 {
	 RestaurantDTO dto=new RestaurantDTO();
	 dto.setId(savedRestaurant.getId());
	 dto.setName(savedRestaurant.getName());
	 dto.setCuisine(savedRestaurant.getCuisine());
	 dto.setAddress(savedRestaurant.getAddress());
	 dto.setRating(savedRestaurant.getRating());
	return dto;
	 
 }
 //dto to entity
 private Restaurant toEntity(RestaurantDTO dto)  
 {
	 Restaurant res=new Restaurant();
	 res.setId(dto.getId());
	 res.setName(dto.getName());
	 res.setAddress(dto.getAddress());
	 res.setCuisine(dto.getCuisine());
	 res.setRating(dto.getRating());
	 
	 return res;
	
 }
 
 public RestaurantDTO createRestaurant(RestaurantDTO dto)
 {
	 Restaurant restaurant=toEntity(dto);
	
	 Restaurant savedRestaurant = repo.save(restaurant);
	 return toDto(savedRestaurant);
	 
 }
 public List<RestaurantDTO> getAllRestaurants()
 {
	 return repo.findAll().stream().map(this::toDto).collect(Collectors.toList());
 }
 
}
