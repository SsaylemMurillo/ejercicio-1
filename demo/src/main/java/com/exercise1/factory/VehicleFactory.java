package com.exercise1.factory;

import com.exercise1.model.Chassis;
import com.exercise1.model.Engine;
import com.exercise1.model.Upholstery;

public interface VehicleFactory {
    Chassis createChassis(String nAxes, String pNumber, String tType);

    Engine createEngine(String mPower, String pNumber, String tech);

    Upholstery createUpholstery(String pNumber, String mat);
}
