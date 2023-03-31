package be.jidoka.clean.code.meaningful.names.encodings.avoid.domain;

import java.awt.*;

public class Car {

    // The key word final already tells you this is a constant!
    private static final int CONS_MAXIMUM_KILOMETERS_ALLOWED = 300_000;

    // Why encode that these fields are member variables? Our IDE colors them by default!
    private final String m_brand;
    private final String m_make;
    private final String m_ownerName;
    private final int m_kilometersDriven;
    private final Color m_color;

    public Car(String brand, String make, String ownerName, int kilometersDriven, Color color) {
        this.m_brand = brand;
        this.m_make = make;
        this.m_ownerName = ownerName;
        this.m_kilometersDriven = kilometersDriven;
        this.m_color = color;
    }

    // IDE generated getters are now incorrect?! Or at least hard to read/pronounce.
    public String getM_brand() {
        return m_brand;
    }

    public String getM_make() {
        return m_make;
    }

    public String getM_ownerName() {
        return m_ownerName;
    }

    public int getM_kilometersDriven() {
        return m_kilometersDriven;
    }

    public Color getM_color() {
        return m_color;
    }

}
