package be.jidoka.clean.code.meaningful.names.encodings.avoid.domain;

import java.awt.*;

public class Car {

    // The key word final already tells you this is a constant!
    private static final int CONS_MAXIMUM_KILOMETERS_ALLOWED = 300_000;

    // Why encode that this fields are member variables? Our IDE colors them by default!
    private String m_brand;

    private String m_make;

    private String m_ownerName;

    private int m_kilometersDriven;

    private Color m_color;

    public Car(String m_brand, String m_make, String m_ownerName, int m_kilometersDriven, Color m_color) {
        this.m_brand = m_brand;
        this.m_make = m_make;
        this.m_ownerName = m_ownerName;
        this.m_kilometersDriven = m_kilometersDriven;
        this.m_color = m_color;
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
