package com.exercise1.builder;

import com.exercise1.model.Engine;
import com.exercise1.model.Upholstery;
import com.exercise1.model.Vehicle;
import com.exercise1.model.Chassis;

public class VehicleBuilder implements IVehicleBuilder {
    private Chassis chassis;
    private Engine engine;
    private Upholstery upholstery;
    private String color;
    private String assemblyDate;
    private String assemblyNumber;

    @Override
    public void chassis(Chassis chassis) {
        this.chassis = chassis;
    }

    @Override
    public void engine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public void upholstery(Upholstery upholstery) {
        this.upholstery = upholstery;
    }

    @Override
    public void color(String color) {
        this.color = color;
    }

    @Override
    public void assemblyDate(String assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    @Override
    public void assemblyNumber(String assemblyNumber) {
        this.assemblyNumber = assemblyNumber;
    }

    @Override
    public Vehicle build() {
        return new Vehicle(chassis, engine, upholstery, assemblyDate, assemblyNumber, color);
    }


}
