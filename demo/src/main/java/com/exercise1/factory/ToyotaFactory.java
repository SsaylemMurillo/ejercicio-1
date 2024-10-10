package com.exercise1.factory;

import com.exercise1.model.Chassis;
import com.exercise1.model.Engine;
import com.exercise1.model.Upholstery;

public class ToyotaFactory implements VehicleFactory {
    @Override
    public Chassis createChassis(String nAxes, String pNumber, String tType) {
        Chassis toyotaChassis = new Chassis() {
            @Override
            public void createChassis() {
                this.numberOfAxes = nAxes;
                this.partNumber = pNumber;
                this.transmissionType = tType;
            }
        };
        toyotaChassis.createChassis();
        return toyotaChassis;
    }

    @Override
    public Engine createEngine(String mPower, String pNumber, String tech) {
        Engine toyotaEngine = new Engine() {
            @Override
            public void createEngine() {
                this.maxPower = mPower;
                this.partNumber = pNumber;
                this.technology = tech;
            }
        };
        toyotaEngine.createEngine();
        return toyotaEngine;
    }

    @Override
    public Upholstery createUpholstery(String pNumber, String mat) {
        Upholstery toyotaUpholstery = new Upholstery() {
            @Override
            public void createUpholstery() {
                this.partNumber = pNumber;
                this.material = mat;
            }
        };
        toyotaUpholstery.createUpholstery();
        return toyotaUpholstery;
    }
}