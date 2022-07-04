package com.example.vehicle.controller;

import com.example.vehicle.entity.Car;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
@RequestMapping("/vehicle")
public class CarController {

    @GetMapping("/mycar")
    public Car car() {
        log.info("Getting my car");

        return Car.builder()
                .id(1L)
                .manufacturer("VW")
                .modelName("Touran")
                .prodYear("2004")
                .engineCapacity(1.9)
                .plateNumber("LV-2022")
                .build();
    }
}
