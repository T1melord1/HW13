package com.computer.Processor;

public class Processor {
    private double weight;
    private Frequency frequency;
    private CoreCount coreCount;
    private Manufacturer manufacturer;

    public Processor(double weight, Frequency frequency, CoreCount coreCount, Manufacturer manufacturer) {
        this.weight = weight;
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.manufacturer = manufacturer;
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
                ", frequency=" + frequency +
                ", coreCount=" + coreCount +
                ", manufacturer=" + manufacturer +
                '}';
    }
}
