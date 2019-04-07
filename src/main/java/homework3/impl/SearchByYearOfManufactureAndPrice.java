package homework3.impl;

import homework3.entity.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchByYearOfManufactureAndPrice {
    public void searchByYearOfManufactureAndPrice(ArrayList<Car> carsCatalogue, Scanner scan) {
        System.out.println("Type year of manufacture and price");
        int userYearOfManufacture = scan.nextInt();
        double userPrice = scan.nextDouble();
        for (Car car : carsCatalogue) {
            if (car.getYearOfManufacture() == userYearOfManufacture && car.getPrice() > userPrice) {
                System.out.println(car);
            }
        }
    }
}
