package com.example.vehicle.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@Entity(name = "cars")
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Long id;

    String manufacturer, modelName, prodYear, plateNumber;

    Double engineCapacity;

    public Car(String manufacturer, String modelName, String prodYear, String plateNumber, Double engineCapacity) {
        this.manufacturer = manufacturer;
        this.modelName = modelName;
        this.prodYear = prodYear;
        this.plateNumber = plateNumber;
        this.engineCapacity = engineCapacity;
    }
}
