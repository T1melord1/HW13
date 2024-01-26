package com.computer;

public class Processor {
    private double weight;
    public enum Frequency{LOW, MEDIUM, HIGH}
    public enum CoreCount{TWO, FOUR, EIGHT}
    public enum Manufacturer{INTEL, AMD}

    private Frequency frequency;
    private CoreCount coreCount;
    private Manufacturer manufacturer;



    public Processor(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public Frequency getFrequency() {
        return frequency;
    }

    public void setFrequency(Frequency frequency) {
        this.frequency = frequency;
    }

    public CoreCount getCoreCount() {
        return coreCount;
    }

    public void setCoreCount(CoreCount coreCount) {
        this.coreCount = coreCount;
    }

    public Manufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(Manufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "weight=" + weight +
                '}';
    }

}
