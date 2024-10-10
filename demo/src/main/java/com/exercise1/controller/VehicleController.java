package com.exercise1.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.exercise1.builder.VehicleBuilder;
import com.exercise1.builder.VehicleDirector;
import com.exercise1.factory.FordFactory;
import com.exercise1.factory.MazdaFactory;
import com.exercise1.factory.ToyotaFactory;
import com.exercise1.factory.VehicleFactory;
import com.exercise1.model.Vehicle;

@RestController
@RequestMapping("/api/vehicle")
public class VehicleController {

    private VehicleFactory myVehicleFactory;
    private VehicleBuilder myVehicleBuilder;
    private VehicleDirector myVehicleDirector;

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

        switch (brand.toLowerCase()) {
            case "toyota" -> {
                this.myVehicleFactory = new ToyotaFactory();
            }
            case "mazda" -> {
                this.myVehicleFactory = new MazdaFactory();
            }
            case "ford" -> {
                this.myVehicleFactory = new FordFactory();
            }
            default -> throw new IllegalArgumentException("Marca no válida: " + brand);
        }

        this.myVehicleBuilder = new VehicleBuilder();

        myVehicleBuilder
                .chassis(this.myVehicleFactory.createChassis(numberOfAxes, chassisPartNumber, transmissionType));
        myVehicleBuilder.engine(this.myVehicleFactory.createEngine(maxPower, enginePartNumber, technology));
        myVehicleBuilder.upholstery(this.myVehicleFactory.createUpholstery(upholsteryPartNumber, material));
        myVehicleBuilder.color(color);
        myVehicleBuilder.assemblyDate(assemblyDate);
        myVehicleBuilder.assemblyNumber(assemblyNumber);

        return myVehicleBuilder.build();
    }

    @GetMapping("/assemble/default")
    public Vehicle assembleDefaultVehicle(@RequestParam String brand) {
        this.myVehicleBuilder = new VehicleBuilder();
        this.myVehicleDirector = new VehicleDirector();

        switch (brand.toLowerCase()) {
            case "toyota" -> {
                return this.myVehicleDirector.constructToyotaVehicle(this.myVehicleBuilder);
            }
            case "mazda" -> {
                return this.myVehicleDirector.constructMazdaVehicle(this.myVehicleBuilder);
            }
            case "ford" -> {
                return this.myVehicleDirector.constructFordVehicle(this.myVehicleBuilder);
            }
            default -> throw new IllegalArgumentException("Marca no válida: " + brand);
        }
    }
}