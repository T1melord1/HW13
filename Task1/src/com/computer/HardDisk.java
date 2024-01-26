package com.computer;

public class HardDisk {
    private int memoryCapacity;
    private double weight;
    public enum Type {HDD,SSD}
    private Type type;

    public HardDisk(int memoryCapacity, double weight) {
        this.memoryCapacity = memoryCapacity;
        this.weight = weight;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    public void setMemoryCapacity(int memoryCapacity) {
        this.memoryCapacity = memoryCapacity;
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
        return "HardDisk{" +
                "memoryCapacity=" + memoryCapacity +
                ", weight=" + weight +
                '}';
    }
}
