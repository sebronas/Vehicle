package com.example.vehicle.controller;

import com.example.vehicle.entity.Car;
import com.example.vehicle.repository.CarRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@Slf4j
@RequestMapping("/vehicle") //This means URL's start with /vehicle (after Application path)
public class CarController {

    @Autowired  // This means to get the bean called CarRepository
                // which is auto-generated by Spring, we will use it to handle the data
    private CarRepository carRepository;

    @PostMapping(path = "/createCar") // Map ONLY POST requests
    public @ResponseBody String addNewCar(     // @ResponseBody means the returned String is the response, not a view name
            @RequestParam String manufacturer, // @RequestParam means it is a parameter from the GET or POST request
            @RequestParam String modelName,
            @RequestParam String prodYear,
            @RequestParam double engineCapacity,
            @RequestParam String plateNumber) {
        Car c = new Car();
        c.setManufacturer(manufacturer);
        c.setModelName(modelName);
        c.setProdYear(prodYear);
        c.setEngineCapacity(engineCapacity);
        c.setPlateNumber(plateNumber);
        return "Saved";
    }


    @GetMapping("/mycars")
    public @ResponseBody Iterable<Car> getAllCars() {
        log.info("Getting my car");

        return carRepository.findAll();
    }
}