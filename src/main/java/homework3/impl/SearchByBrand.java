package homework3.impl;

import homework3.entity.Car;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchByBrand {
    public void searchByBrand(ArrayList<Car> carsCatalogue, Scanner scan) {
        System.out.println("Type brand name");
        String userBrand = scan.next();
        for (Car car : carsCatalogue) {
            if (car.getBrand().equals(userBrand)) {
                System.out.println(car);
            }
        }
    }
}
