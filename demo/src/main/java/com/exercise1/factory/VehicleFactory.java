package com.exercise1.factory;

import com.exercise1.model.Chassis;
import com.exercise1.model.Engine;
import com.exercise1.model.Upholstery;

public abstract class VehicleFactory {
    
    public abstract Chassis createChassis(String nAxes, String pNumber, String tType);
    public abstract Engine createEngine(String mPower, String pNumber, String tech);
    public abstract Upholstery createUpholstery(String pNumber, String mat);

    public static VehicleFactory getFactory(String brand) {
        switch (brand.toLowerCase()) {
            case "toyota" -> {
                return new ToyotaFactory();
            }
            case "ford" -> {
                return new FordFactory();
            }
            case "mazda" -> {
                return new MazdaFactory();
            }
            default -> throw new IllegalArgumentException("Marca no válida: " + brand);
        }
    }
}
