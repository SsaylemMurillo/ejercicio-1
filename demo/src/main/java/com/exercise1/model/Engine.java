package com.exercise1.model;

public abstract class Engine {
    protected String maxPower;
    protected String partNumber;
    protected String technology;

    public abstract void createEngine();

    public String getMaxPower() {
        return maxPower;
    }

    public void setMaxPower(String maxPower) {
        this.maxPower = maxPower;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getTechnology() {
        return technology;
    }

    public void setTechnology(String technology) {
        this.technology = technology;
    }

    @Override
    public String toString() {
        return "Engine [Power=" + maxPower + ", Part Number=" + partNumber + ", Technology=" + technology + "]";
    }
}
