package com.exercise1.builder;

import com.exercise1.model.Chassis;
import com.exercise1.model.Engine;
import com.exercise1.model.Upholstery;
import com.exercise1.model.Vehicle;

public interface IVehicleBuilder {
    void chassis(Chassis chassis);
    void engine(Engine engine);
    void upholstery(Upholstery upholstery);
    void color(String color);
    void assemblyDate(String assemblyDate);
    void assemblyNumber(String assemblyNumber);
    Vehicle build();
}
