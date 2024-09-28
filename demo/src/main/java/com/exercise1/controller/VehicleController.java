package com.exercise1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exercise1.builder.IVehicleBuilder;
import com.exercise1.builder.VehicleBuilder;
import com.exercise1.builder.VehicleDirector;
import com.exercise1.factory.VehicleFactory;
import com.exercise1.model.Vehicle;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    @PostMapping("/assemble/moddedvehicle")
    public Vehicle assembleModdedVehicle(@RequestParam String brand, 
                                          @RequestParam String color, 
                                          @RequestParam String assemblyDate, 
                                          @RequestParam String chassisPartNumber, 
                                          @RequestParam String numberOfAxes, 
                                          @RequestParam String transmissionType, 
                                          @RequestParam String maxPower, 
                                          @RequestParam String enginePartNumber, 
                                          @RequestParam String technology, 
                                          @RequestParam String upholsteryPartNumber, 
                                          @RequestParam String material,
                                          @RequestParam String assemblyNumber) {

        VehicleFactory factory = VehicleFactory.getFactory(brand);
        IVehicleBuilder builder = new VehicleBuilder();
        
        builder.chassis(factory.createChassis(numberOfAxes, chassisPartNumber, transmissionType));
        builder.engine(factory.createEngine(maxPower, enginePartNumber, technology));
        builder.upholstery(factory.createUpholstery(upholsteryPartNumber, material));
        builder.color(color);
        builder.assemblyDate(assemblyDate);
        builder.assemblyNumber(assemblyNumber); 

        return builder.build();
    }

    @GetMapping("/assemble/default")
    public Vehicle assembleDefaultVehicle(@RequestParam String brand) {
        VehicleBuilder builder = new VehicleBuilder();
        VehicleDirector director = new VehicleDirector(builder);
        
        switch (brand.toLowerCase()) {
            case "toyota" -> {
                return director.constructToyotaVehicle();
            }
            case "mazda" -> {
                return director.constructMazdaVehicle();
            }
            case "ford" -> {
                return director.constructFordVehicle();
            }
            default -> throw new IllegalArgumentException("Marca no válida: " + brand);
        }
    }
}