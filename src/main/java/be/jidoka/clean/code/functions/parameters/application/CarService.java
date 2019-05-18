package be.jidoka.clean.code.functions.parameters.application;

import be.jidoka.clean.code.functions.parameters.domain.Car;

import static java.awt.Color.BLUE;

public class CarService {

    public Car createCar() {
        // Extra benefits:
        //  + Can simply leave out optional fields, no need to pass in nulls to optional parameters. (e.g.: kilometersDriven)
        //  + Clients can provide fields in the order they want.
        //  + Easier to see which argument belongs to which parameter. (e.g.: With a constructor, is the second the String the make or the ownerName?)
        var car = Car.CarBuilder.carBuilderWith()
                .ownerName("Geert Guldentops")
                .brand("BMW")
                .make("316 D")
                .color(BLUE)
                // Simply leave out any optional fields when necessary
//                .kilometersDriven(42_000)
                .build();

        // Compare to: Car car = new Car("Geert Guldentops", "BMW", "316 D", Color.BLUE, 42_000);

        return car;
    }

}
