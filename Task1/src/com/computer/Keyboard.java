package com.computer;

public class Keyboard {
    private double weight;
    public enum Type{MEMBRANE, MECHANICAL}
    public enum Backlight{YES, NO}
    private Type type;
    private Backlight backlight;

    public Keyboard(double weight) {
        this.weight = weight;
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

    public Backlight getBacklight() {
        return backlight;
    }

    public void setBacklight(Backlight backlight) {
        this.backlight = backlight;
    }

    @Override
    public String toString() {
        return "Keyboard{" +
                "weight=" + weight +
                '}';
    }
}
