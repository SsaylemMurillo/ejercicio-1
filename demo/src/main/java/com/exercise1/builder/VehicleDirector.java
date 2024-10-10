package com.exercise1.builder;

import com.exercise1.factory.FordFactory;
import com.exercise1.factory.MazdaFactory;
import com.exercise1.factory.ToyotaFactory;
import com.exercise1.factory.VehicleFactory;
import com.exercise1.model.Vehicle;

public class VehicleDirector {

    public Vehicle constructToyotaVehicle(IVehicleBuilder builder) {
        VehicleFactory factory = new ToyotaFactory();

        builder.chassis(factory.createChassis("4", "T-123", "Automatic"));
        builder.engine(factory.createEngine("200HP", "T-456", "Hybrid"));
        builder.upholstery(factory.createUpholstery("T-789", "Leather"));
        builder.color("Blanco");
        builder.assemblyDate("2024-09-28");
        builder.assemblyNumber("T-0001");

        return builder.build();
    }

    public Vehicle constructMazdaVehicle(IVehicleBuilder builder) {
        VehicleFactory factory = new MazdaFactory();

        builder.chassis(factory.createChassis("4", "M-123", "Manual"));
        builder.engine(factory.createEngine("187HP", "M-456", "SkyActiv"));
        builder.upholstery(factory.createUpholstery("M-789", "Cloth"));
        builder.color("Rojo");
        builder.assemblyDate("2024-09-29");
        builder.assemblyNumber("M-0001");

        return builder.build();
    }

    public Vehicle constructFordVehicle(IVehicleBuilder builder) {
        VehicleFactory factory = new FordFactory();

        builder.chassis(factory.createChassis("4", "F-123", "Automatic"));
        builder.engine(factory.createEngine("450HP", "F-456", "EcoBoost"));
        builder.upholstery(factory.createUpholstery("F-789", "Synthetic Leather"));
        builder.color("Azul");
        builder.assemblyDate("2024-09-30");
        builder.assemblyNumber("F-0001");

        return builder.build();
    }
}