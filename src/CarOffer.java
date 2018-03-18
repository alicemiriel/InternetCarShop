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
        return String.format("This is our offer %s and the purchase price is %d, as for the rental it's %d", car, purchasePrice, rentalPrice);
    }}
