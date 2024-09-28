package com.exercise1.factory;

import com.exercise1.model.Chassis;
import com.exercise1.model.Engine;
import com.exercise1.model.Upholstery;

public class MazdaFactory extends VehicleFactory {

    @Override
    public Chassis createChassis(String nAxes, String pNumber, String tType) {
        Chassis mazdaChassis = new Chassis() {
            @Override
            public void createChassis() {
                this.numberOfAxes = nAxes;
                this.partNumber = pNumber;
                this.transmissionType = tType;
            }
        };
        mazdaChassis.createChassis();
        return mazdaChassis;
    }

    @Override
    public Engine createEngine(String mPower, String pNumber, String tech) {
        Engine mazdaEngine = new Engine() {
            @Override
            public void createEngine() {
                this.maxPower = mPower;
                this.partNumber = pNumber;
                this.technology = tech;
            }
        };
        mazdaEngine.createEngine();
        return mazdaEngine;
    }

    @Override
    public Upholstery createUpholstery(String pNumber, String mat) {
        Upholstery mazdaUpholstery = new Upholstery() {
            @Override
            public void createUpholstery() {
                this.partNumber = pNumber;
                this.material = mat;
            }
        };
        mazdaUpholstery.createUpholstery();
        return mazdaUpholstery;
    }
}

