package com.example.vehicle.repository;

import com.example.vehicle.entity.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepository extends CrudRepository<Car, Integer> {

}
