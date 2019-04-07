package homework3;


import homework3.entity.Car;
import homework3.service.CarCatalogue;
import homework3.ui.CarCatalogueFilters;

public class CatalogueRunner {
    public static void main(String[] arg) {
        CarCatalogue carCatalogue = new CarCatalogue();

        carCatalogue.addCars(new Car
                (7849571983L, "Chevy", "Camaro", 1972, "yellow",
                        6000.00, "AZ7856"));
        carCatalogue.addCars(new Car(88756434L, "Pontiac", "Soltice", 1990, "emerald",
                4500.50, "AK8713"));
        carCatalogue.addCars(new Car(1234981212L, "Ford", "Mustang", 1998, "blue",
                "FL1521"));
        carCatalogue.addCars(new Car(8812650012L, "Ford", "Probe", 1994, "black",
                6999.99, "MC1515"));
        carCatalogue.addCars(new Car(2525846533L, "Ford", "Mercury", 1968, "white",
                12000.00, "CL888"));
        carCatalogue.addCars(new Car(6612650012L, "Ford", "Probe", 1998, "black",
                8499.99, "CL1987"));

        CarCatalogueFilters filter = new CarCatalogueFilters();
        filter.catalogueFilters(carCatalogue.getCars());
    }
}
