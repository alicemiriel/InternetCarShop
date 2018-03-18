import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        List<Car> cars;
        cars = DataGenerator.generateCars();
        System.out.println(cars);

        List<CarOffer> listOfOffers;
        listOfOffers = DataGenerator.generateCarOffers();
        System.out.println(listOfOffers);

        CarShop myLittleCarShop = new CarShop("Little Shop");
        myLittleCarShop.carOffersAdd(listOfOffers.toArray(new CarOffer[]{}));
        System.out.println(myLittleCarShop);

        System.out.println(myLittleCarShop.getCarBrand());
        System.out.println(myLittleCarShop.gerCarsWithDrivesforFourWheels());

        Scanner scanner = new Scanner(System.in);
        System.out.println("Could you kindly please advise car of what year you are interested in?");
        int yourYear = scanner.nextInt();
        System.out.println(myLittleCarShop.showCarsBasedOnYourYear(yourYear));

        System.out.println("Could you kindly please advise what car brand you are looking for? Please choose from the one we have. \n We have: " + myLittleCarShop.getCarBrand());
        CarBrand brand = CarBrand.valueOf(scanner.next());
        System.out.println(myLittleCarShop.showCarsBasedOnBrands(brand));

        System.out.println(myLittleCarShop.sortCarsBasedOnCombustion());
        System.out.println(myLittleCarShop.sortCarsBasedOnPrice());
        System.out.println(myLittleCarShop.sortBasedOnCheapestRenatlPrice());
        System.out.println(myLittleCarShop.getAllCars());
        System.out.println(myLittleCarShop.getCheapestCarsforBestEnginePower());

    }
}
