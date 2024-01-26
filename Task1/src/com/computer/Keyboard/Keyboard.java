package com.computer.Keyboard;

public class Keyboard {
    private double weight;
    private Type type;
    private Backlight backlight;

    public Keyboard(double weight, Type type, Backlight backlight) {
        this.weight = weight;
        this.type = type;
        this.backlight = backlight;
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
                ", type=" + type +
                ", backlight=" + backlight +
                '}';
    }
}
