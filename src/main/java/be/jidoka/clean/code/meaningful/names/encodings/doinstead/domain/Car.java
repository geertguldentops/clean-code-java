package be.jidoka.clean.code.meaningful.names.encodings.doinstead.domain;

import java.awt.*;

public class Car {

    // Do note the Java naming convention to write the names of static final variables in capitals!
    private static final int CONS_MAXIMUM_KILOMETERS_ALLOWED = 300_000;

    private String brand;

    private String make;

    private String ownerName;

    private int kilometersDriven;

    private Color color;

    public Car(String brand, String make, String ownerName, int kilometersDriven, Color color) {
        // The IDE makes it clear what is a member field and what is not.
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
