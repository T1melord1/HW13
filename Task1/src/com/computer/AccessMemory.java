package com.computer;

public class AccessMemory {
    private double volume;
    private double weight;
    public enum Type{DDR3, DDR4, DDR5}
    private Type type;

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

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "AccessMemory{" +
                "volume=" + volume +
                ", weight=" + weight +
                '}';
    }
}
