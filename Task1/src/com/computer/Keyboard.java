package com.computer;

public class Keyboard {
    private double weight;

    public Keyboard(double weight) {
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
        return "Keyboard{" +
                "weight=" + weight +
                '}';
    }
}
