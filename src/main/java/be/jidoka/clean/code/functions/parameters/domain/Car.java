package be.jidoka.clean.code.functions.parameters.domain;

import java.awt.*;

public class Car {

    private String brand;
    private String make;
    private String ownerName;
    private int kilometersDriven;
    private Color color;

    // Avoid having 5 parameters in this constructor (+ maintenance when it becomes more or less!)
    // Hide constructor, clients should use the CarBuilder!
    private Car(CarBuilder carBuilder) {
        this.brand = carBuilder.brand;
        this.make = carBuilder.make;
        this.ownerName = carBuilder.ownerName;
        this.kilometersDriven = carBuilder.kilometersDriven;
        this.color = carBuilder.color;
    }

    // GoF Builder pattern.
    public static class CarBuilder {

        private String brand;
        private String make;
        private String ownerName;
        private int kilometersDriven;
        private Color color;

        // Hide Builder constructor.
        private CarBuilder() {
        }

        // Static factory to instantiate the Builder.
        public static CarBuilder carBuilderWith() {
            return new CarBuilder();
        }

        public CarBuilder brand(String brand) {
            this.brand = brand;
            return this;
        }

        public CarBuilder make(String make) {
            this.make = make;
            return this;
        }

        public CarBuilder ownerName(String ownerName) {
            this.ownerName = ownerName;
            return this;
        }

        public CarBuilder kilometersDriven(int kilometersDriven) {
            this.kilometersDriven = kilometersDriven;
            return this;
        }

        public CarBuilder color(Color color) {
            this.color = color;
            return this;
        }

        public Car build() {
            return new Car(this);
        }

    }

}
