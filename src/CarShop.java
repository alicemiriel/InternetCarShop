import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

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

    @Override
    public String toString() {
        return String.format("Welcome to shope named %s,  our offers are as presetented %s", name, carOffers.toString());
    }

    public void carOffersAdd(CarOffer... carOffer) {
        carOffers.addAll((Arrays.asList(carOffer)));
    }
}
