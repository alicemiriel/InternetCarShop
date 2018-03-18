import java.util.*;
import java.util.stream.Collectors;

public class CarShop {
    private String name;
    private List<CarOffer> carOffers;

    public CarShop(String name) {
        this.name = name;
        this.carOffers = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<CarOffer> getCarOffers() {
        return carOffers;
    }

    public Set<CarBrand> getCarBrand(){
        return carOffers.stream()
                .map(carOffer -> carOffer.getCar().getMark())
                .collect(Collectors.toSet());
    }
    public List<Car> gerCarsWithDrivesforFourWheels(){
        return getCarOffers().stream()
                .map(CarOffer::getCar)
                .filter(car -> car.getDrive() == CarDrive.BOTH)
                .collect(Collectors.toList());
    }

    @Override
    public String toString() {
        return String.format("Welcome to shope named %s,  our offers are as presetented %s", name, carOffers.toString());
    }

    public void carOffersAdd(CarOffer... carOffer) {
        carOffers.addAll((Arrays.asList(carOffer)));
    }
    public List<Car> showCarsBasedOnYourYear(int yourYear){
        return getCarOffers().stream()
                .map(CarOffer::getCar)
                .filter(car -> car.getProductionDate().getYear()>=yourYear)
                .collect(Collectors.toList());
    }
    public List<Car> showCarsBasedOnBrands(CarBrand carBrand){
        return getCarOffers().stream()
                .map(CarOffer::getCar)
                .filter(car -> car.getMark().equals(carBrand))
                .collect(Collectors.toList());
    }

    public List<Car> sortCarsBasedOnCombustion(){
        return getCarOffers().stream()
                .map(CarOffer::getCar)
                .sorted((o1, o2) -> (int) (o1.getCombustion() - o2.getCombustion()))
                .collect(Collectors.toList());
    }
    public List<Car> sortCarsBasedOnEngineower(){
        return getCarOffers().stream()
                .map(CarOffer::getCar)
                .sorted((o1, o2) -> (int) (o1.getEnginePower() - o2.getEnginePower()))
                .collect(Collectors.toList());
    }

    public List<CarOffer> sortCarsBasedOnPrice(){
        return getCarOffers().stream()
                .sorted((o1, o2) -> (o1.getPurchasePrice() - o2.getPurchasePrice()))
                .collect(Collectors.toList());
    }

    public List<CarOffer> sortBasedOnCheapestRenatlPrice(){
        return getCarOffers().stream()
                .sorted(((o1, o2) -> o2.getRentalPrice()-o1.getRentalPrice()))
                .collect(Collectors.toList());
    }

    public List<Car> getAllCars(){
        return getCarOffers().stream()
                .map(CarOffer::getCar)
                .collect(Collectors.toList());
    }
    public List<Car> getCheapestCarsforBestEnginePower(){
        Comparator<CarOffer> comparator = Comparator.comparing(carOffer -> carOffer.getCar().getEnginePower());
        comparator = comparator.thenComparing(Comparator.comparing(CarOffer::getPurchasePrice).reversed());
        return getCarOffers().stream()
                .sorted(comparator)
                .map(CarOffer::getCar)
                .collect(Collectors.toList());
    }

}
