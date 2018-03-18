import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class CarsGenerator {

    public static List<Car> generateCars() {

        List<Car> generatedCars = new ArrayList<Car>(Arrays.asList(
                new Car(CarBrand.AUDI, "car1", CarType.HATCHBACK, 12.1, 2,
                        4, 20, 2017, true),
                new Car(CarBrand.BMW, "car2", CarType.CABRIO, 12.41, 2,
                        2, 71, 2015, true),
                new Car(CarBrand.AUDI, "car3", CarType.SEDAN, 13.4, 2,
                        4, 20, 2019, true),
                new Car(CarBrand.AUDI, "car4", CarType.SUV, 12.1, 2,
                        6, 17, 2017, true),
                new Car(CarBrand.MERCEDES, "car5", CarType.HATCHBACK, 12.1, 2,
                        4, 13, 2017, false),
                new Car(CarBrand.MAZDA, "car6", CarType.CABRIO, 12.1, 2,
                        4, 32, 2015, true),
                new Car(CarBrand.MERCEDES, "car7", CarType.KOMBI, 12.1, 25,
                        5, 11, 2019, true),
                new Car(CarBrand.FIAT, "car8", CarType.SUV, 12.1, 2,
                        14, 20, 2015, true),
                new Car(CarBrand.AUDI, "car9", CarType.CABRIO, 12.1, 2,
                        40, 12, 2019, false),
                new Car(CarBrand.MAZDA, "car10", CarType.CABRIO, 122.1, 1,
                        4, 20, 2019, true),

                new Car(CarBrand.BMW, "car11", CarType.SEDAN, 12.1, 2,
                        5, 20, 2015, true),
                new Car(CarBrand.HONDA, "car12", CarType.HATCHBACK, 712.1, 2,
                        6, 14, 2019, false),
                new Car(CarBrand.FIAT, "car13", CarType.CABRIO, 12.71, 2,
                        2, 16, 2019, true),
                new Car(CarBrand.FORD, "car14", CarType.SUV, 13.5, 3,
                        1, 18, 1990, true),
                new Car(CarBrand.HYUNDAI, "car15", CarType.CABRIO, 12.1, 4,
                        4, 25, 2017, true)
        ));
        return generatedCars;
    }
}


