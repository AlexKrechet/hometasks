package homework3.service;

import homework3.entity.Car;

import java.util.ArrayList;

public class CarCatalogue {

    ArrayList<Car> carsCatalogue = new ArrayList<Car>();

    public void addCars(Car car) {
        carsCatalogue.add(car);
    }

    public ArrayList<Car> getCars() {
        return carsCatalogue;
    }

    @Override
    public String toString() {
        String output = "";
        for (Car car : carsCatalogue) {
            output += car.getId() + " " + car.getBrand() + " " + car.getModel() + " " + car.getYearOfManufacture() +
                    " " + car.getColor() + " " + car.getPrice() + " " + car.getRegNumber() + "\n";
        }
        return output;
    }
}
