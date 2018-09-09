package be.jidoka.clean.code.meaningful.names.encodings.doinstead.domain;

import java.awt.*;

public class Car {

    // Do note the Java naming convention to write the names of static final variables in capitals!
    private static final int MAXIMUM_KILOMETERS_ALLOWED = 300_000;

    private final String brand;
    private final String make;
    private final String ownerName;
    private final int kilometersDriven;
    private final Color color;

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
