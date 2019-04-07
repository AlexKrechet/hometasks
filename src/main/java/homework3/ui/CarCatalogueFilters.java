package homework3.ui;

import homework3.impl.SearchByBrand;
import homework3.impl.SearchByModelAndTermsOfUse;
import homework3.impl.SearchByYearOfManufactureAndPrice;
import homework3.entity.Car;

import java.util.ArrayList;
import java.util.Scanner;


public class CarCatalogueFilters {
    public void catalogueFilters(ArrayList<Car> carsCatalogue) {
        Scanner scan = new Scanner(System.in);
        int options = 0;
        System.out.println(
                "press 1 - search by brand name\n" +
                        "press 2 - search by model and terms of use\n" +
                        "press 3 - search by year of manufacture and price\n" +
                        "press 4 - exit\n");

        for (options = scan.nextInt(); options > 0 && options <= 4; options = scan.nextInt()) {
            if (options == 4) {
                System.out.println("Goodbye!");
                break;
            } else {
                switch (options) {
                    case 1:
                        SearchByBrand searchByBrand = new SearchByBrand();
                        searchByBrand.searchByBrand(carsCatalogue, scan);
                        break;
                    case 2:
                        SearchByModelAndTermsOfUse modelAndTerms = new SearchByModelAndTermsOfUse();
                        modelAndTerms.searchByModelAndTermsOfUse(carsCatalogue, scan);
                        break;
                    case 3:
                        SearchByYearOfManufactureAndPrice yearOfManufactureAndPrice =
                                new SearchByYearOfManufactureAndPrice();
                        yearOfManufactureAndPrice.searchByYearOfManufactureAndPrice(carsCatalogue, scan);
                        break;
                }
            }
        }
        scan.close();
    }
}






