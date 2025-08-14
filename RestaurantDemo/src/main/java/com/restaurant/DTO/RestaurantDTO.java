package com.restaurant.DTO;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;

public class RestaurantDTO {
	
	private Long id;
	@NotBlank(message="Name cannt be blank")
	private String name;
	@NotBlank(message="cuisine cannot be blank")
	private String cuisine;
	@NotBlank(message="Address cannot beblank")
	private String address;
	@JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private double rating;
	public RestaurantDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RestaurantDTO(Long id, @NotBlank(message = "Name cannt be blank") String name,
			@NotBlank(message = "cuisine cannot be blank") String cuisine,
			@NotBlank(message = "Address cannot beblank") String address,double rating) {
		super();
		this.id = id;
		this.name = name;
		this.cuisine = cuisine;
		this.address = address;
		this.rating=rating;
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCuisine() {
		return cuisine;
	}
	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public double getRating() {
		return rating;
	}
	public void setRating(double rating) {
		this.rating = rating;
	}
	
	
	
	
	
}
