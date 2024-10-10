package com.exercise1.model;

public abstract class Upholstery {
    protected String partNumber;
    protected String material;

    public abstract void createUpholstery();

    // Getters y setters
    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    @Override
    public String toString() {
        return "Upholstery [Part Number=" + partNumber + ", Material=" + material + "]";
    }
}