public class CarShop {
    private String name;
    private CarOffer carOffer;

    public CarShop(String name, CarOffer carOffer) {
        this.name = name;
        this.carOffer = carOffer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarOffer getCarOffer() {
        return carOffer;
    }

    public void setCarOffer(CarOffer carOffer) {
        this.carOffer = carOffer;
    }
}
