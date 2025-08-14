package com.restaurant.Repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.restaurant.Entity.Restaurant;
@Repository
public interface RestaurantRepo extends JpaRepository<Restaurant,Long> {

}
