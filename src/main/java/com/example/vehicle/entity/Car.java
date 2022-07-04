package com.example.vehicle.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Car {
    Long id;
    String manufacturer, modelName, prodYear, plateNumber;
    Double engineCapacity;
}
