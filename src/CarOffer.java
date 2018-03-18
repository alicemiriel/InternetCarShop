public class CarOffer {
   private Car car;
   private int purchasePrice;
   private int rentalPrice;

    public CarOffer(Car car, int purchasePrice, int rentalPrice) {
        this.car = car;
        this.purchasePrice = purchasePrice;
        this.rentalPrice = rentalPrice;
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return String.format("Car %s you can purchase it fo %d, and rent for %d", car, purchasePrice, rentalPrice);
    }

    public int getPurchasePrice() {
        return purchasePrice;
    }

    public void setPurchasePrice(int purchasePrice) {
        this.purchasePrice = purchasePrice;
    }

    public int getRentalPrice() {
        return rentalPrice;
    }

    public void setRentalPrice(int rentalPrice) {
        this.rentalPrice = rentalPrice;
    }
}
