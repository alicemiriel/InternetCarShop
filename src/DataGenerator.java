import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class DataGenerator {

    public static List<Car> generateCars() {

        return generateCarOffers().stream()
                .map(carOffer -> carOffer.getCar())
                .collect(Collectors.toList());
    }

    public static List<CarOffer> generateCarOffers() {
        return new ArrayList<>(Arrays.asList(
                new CarOffer(new Car(CarBrand.AUDI, "car1", CarType.HATCHBACK, 12.1, 2,
                        4, 20, LocalDate.of(2018, 12, 13), true, CarDrive.FRONT), 1000000, 74100),
                new CarOffer(new Car(CarBrand.BMW, "car2", CarType.CABRIO, 12.41, 2,
                        2, 71, LocalDate.of(2019, 12, 13), true, CarDrive.BACK), 1022200, 1700),
                new CarOffer(new Car(CarBrand.AUDI, "car3", CarType.SEDAN, 13.4, 2,
                        4, 20, LocalDate.of(2019, 12, 13), true, CarDrive.BOTH), 1000200, 1400),
                new CarOffer(new Car(CarBrand.AUDI, "car4", CarType.SUV, 12.1, 2,
                        6, 17, LocalDate.of(2008, 12, 13), true, CarDrive.BACK), 10220000, 100),
                new CarOffer(new Car(CarBrand.MERCEDES, "car5", CarType.HATCHBACK, 12.1, 2,
                        4, 13, LocalDate.of(2019, 12, 13), false, CarDrive.BACK), 2201000, 100),
                new CarOffer(new Car(CarBrand.MAZDA, "car6", CarType.CABRIO, 12.1, 2,
                        4, 32, LocalDate.of(2019, 12, 13), true, CarDrive.FRONT), 13330000, 1300),
                new CarOffer(new Car(CarBrand.MERCEDES, "car7", CarType.KOMBI, 12.1, 25,
                        5, 11, LocalDate.of(2015, 12, 13), true, CarDrive.BOTH), 1450000, 1400),
                new CarOffer(new Car(CarBrand.FIAT, "car8", CarType.SUV, 12.1, 2,
                        14, 20, LocalDate.of(2019, 12, 13), true, CarDrive.FRONT), 14789000, 1020),
                new CarOffer(new Car(CarBrand.AUDI, "car9", CarType.CABRIO, 12.1, 2,
                        40, 12, LocalDate.of(2019, 12, 13), false, CarDrive.BACK), 79851000, 10420),
                new CarOffer(new Car(CarBrand.MAZDA, "car10", CarType.CABRIO, 122.1, 1,
                        4, 20, LocalDate.of(2018, 12, 13), true, CarDrive.BOTH), 19899000, 10550),
                new CarOffer(new Car(CarBrand.BMW, "car11", CarType.SEDAN, 12.1, 2,
                        5, 20, LocalDate.of(2013, 12, 13), true, CarDrive.FRONT), 50001000, 1020),
                new CarOffer(new Car(CarBrand.HONDA, "car12", CarType.HATCHBACK, 712.1, 2,
                        6, 14, LocalDate.of(2018, 12, 13), false, CarDrive.BACK), 65471000, 1200),
                new CarOffer(new Car(CarBrand.FIAT, "car13", CarType.CABRIO, 12.71, 2,
                        2, 16, LocalDate.of(2014, 12, 13), true, CarDrive.FRONT), 3681000, 2100),
                new CarOffer(new Car(CarBrand.FORD, "car14", CarType.SUV, 13.5, 3,
                        1, 18, LocalDate.of(2015, 12, 13), true, CarDrive.BOTH), 789451000, 1500),
                new CarOffer(new Car(CarBrand.HYUNDAI, "car15", CarType.CABRIO, 12.1, 4,
                        4, 25, LocalDate.of(2010, 12, 12), true, CarDrive.BACK), 19697000, 500)
        ));
    }


}


