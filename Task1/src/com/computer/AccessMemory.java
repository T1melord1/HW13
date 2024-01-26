package com.computer;

public class AccessMemory {
    private double volume;
    private double weight;

    public AccessMemory(double volume, double weight) {
        this.volume = volume;
        this.weight = weight;
    }

    public double getVolume() {
        return volume;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "AccessMemory{" +
                "volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
