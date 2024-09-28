package com.exercise1.model;

public abstract class Chassis {
    protected String numberOfAxes;
    protected String partNumber;
    protected String transmissionType;

    public abstract void createChassis();
    
    public String getNumberOfAxes() {
        return numberOfAxes;
    }

    public void setNumberOfAxes(String numberOfAxes) {
        this.numberOfAxes = numberOfAxes;
    }

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getTransmissionType() {
        return transmissionType;
    }

    public void setTransmissionType(String transmissionType) {
        this.transmissionType = transmissionType;
    }

    @Override
    public String toString() {
        return "Chassis [Axes=" + numberOfAxes + ", Part Number=" + partNumber + ", Transmission=" + transmissionType + "]";
    }
}
