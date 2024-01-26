package com.computer.AccessMemory;

public class AccessMemory {
    private double volume;
    private double weight;
    private AccessMemoryType type;

    public AccessMemory(double volume, double weight, AccessMemoryType type) {
        this.volume = volume;
        this.weight = weight;
        this.type = type;
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

    public AccessMemoryType getType() {
        return type;
    }

    public void setType(AccessMemoryType type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AccessMemory{" +
                "volume=" + volume +
                ", weight=" + weight +
                ", type=" + type +
                '}';
    }
}
