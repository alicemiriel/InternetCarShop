import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
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
}
