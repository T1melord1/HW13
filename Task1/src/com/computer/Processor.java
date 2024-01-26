package com.computer;

public class Processor {
    private double weight;

    public Processor(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Processor{" +
                "weight=" + weight +
                '}';
    }
}
