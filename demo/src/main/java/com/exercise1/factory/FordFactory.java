package com.exercise1.factory;

import com.exercise1.model.Chassis;
import com.exercise1.model.Engine;
import com.exercise1.model.Upholstery;

public class FordFactory extends VehicleFactory {
    @Override
    public Chassis createChassis(String nAxes, String pNumber, String tType) {
        Chassis fordChassis = new Chassis() {
            @Override
            public void createChassis() {
                this.numberOfAxes = nAxes;
                this.partNumber = pNumber;
                this.transmissionType = tType;
            }
        };
        fordChassis.createChassis();
        return fordChassis;
    }

    @Override
    public Engine createEngine(String mPower, String pNumber, String tech) {
        Engine fordEngine = new Engine() {
            @Override
            public void createEngine() {
                this.maxPower = mPower;
                this.partNumber = pNumber;
                this.technology = tech;
            }
        };
        fordEngine.createEngine();
        return fordEngine;
    }

    @Override
    public Upholstery createUpholstery(String pNumber, String mat) {
        Upholstery fordUpholstery = new Upholstery() {
            @Override
            public void createUpholstery() {
                this.partNumber = pNumber;
                this.material = mat;
            }
        };
        fordUpholstery.createUpholstery();
        return fordUpholstery;
    }
}
