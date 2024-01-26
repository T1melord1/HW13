package com.computer;

public class Screen {
    private double diagonal;
    private double weight;

    public Screen(double diagonal, double weight) {
        this.diagonal = diagonal;
        this.weight = weight;
    }

    public double getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(double diagonal) {
        this.diagonal = diagonal;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    @Override
    public String toString() {
        return "Screen{" +
                "diagonal=" + diagonal +
                ", weight=" + weight +
                '}';
    }
}
