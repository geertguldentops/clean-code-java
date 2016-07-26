package be.jidoka.clean.code.interfac.segregation.principle.domain;

import java.awt.Color;

public class Car {

    private static final int CONS_MAXIMUM_KILOMETERS_ALLOWED = 300_000;

    private String brand;

    private String make;

    private String ownerName;

    private int kilometersDriven;

    private Color color;

    public Car(String brand, String make, String ownerName, int kilometersDriven, Color color) {
        this.brand = brand;
        this.make = make;
        this.ownerName = ownerName;
        this.kilometersDriven = kilometersDriven;
        this.color = color;
    }

    public String getBrand() {
        return brand;
    }

    public String getMake() {
        return make;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getKilometersDriven() {
        return kilometersDriven;
    }

    public Color getColor() {
        return color;
    }

}
