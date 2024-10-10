package com.exercise1.model;

public class Vehicle {
    private Chassis chassis;
    private Engine engine;
    private Upholstery upholstery;
    private String color;
    private String assemblyDate;
    private String assemblyNumber;

    public Vehicle(Chassis chassis, Engine engine, Upholstery upholstery, String assemblyDate, String assemblyNumber, String color) {
        this.assemblyDate = assemblyDate;
        this.assemblyNumber = assemblyNumber;
        this.chassis = chassis;
        this.color = color;
        this.engine = engine;
        this.upholstery = upholstery;
    }

    public Chassis getChassis() {
        return chassis;
    }

    public void setChassis(Chassis chassis) {
        this.chassis = chassis;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Upholstery getUpholstery() {
        return upholstery;
    }

    public void setUpholstery(Upholstery upholstery) {
        this.upholstery = upholstery;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getAssemblyDate() {
        return assemblyDate;
    }

    public void setAssemblyDate(String assemblyDate) {
        this.assemblyDate = assemblyDate;
    }

    public String getAssemblyNumber() {
        return assemblyNumber;
    }

    public void setAssemblyNumber(String assemblyNumber) {
        this.assemblyNumber = assemblyNumber;
    }
}