package homework3.impl;

import homework3.entity.Car;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class SearchByModelAndTermsOfUse {
    public void searchByModelAndTermsOfUse(ArrayList<Car> carsCatalogue, Scanner scan) {
        System.out.println("Type model and terms of use");
        String userModel = scan.next();
        int userTermsOfUse = scan.nextInt();
        Calendar currentYear = Calendar.getInstance();
        for (Car car : carsCatalogue) {
            if (car.getModel().equals(userModel) && (currentYear.get(Calendar.YEAR) -
                    car.getYearOfManufacture()) > userTermsOfUse) {
                System.out.println(car);
            }
        }
    }
}

