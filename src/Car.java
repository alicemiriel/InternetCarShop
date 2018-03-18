import java.time.LocalDate;

public class Car {
    private CarBrand mark;
    private String name;
    private CarType type;
    private double combustion;
    private double engineSize;
    private int numberOfSeats;
    private int enginePower;
    private LocalDate productionDate;
    private boolean automatic;
    private CarDrive drive;

    public Car(CarBrand marka, String name, CarType type, double combustion, double engineSize, int numberOfSeats,
               int enginePower, LocalDate productionDate, boolean automatic, CarDrive drive) {
        this.mark = marka;
        this.name = name;
        this.type = type;
        this.combustion = combustion;
        this.engineSize = engineSize;
        this.numberOfSeats = numberOfSeats;
        this.enginePower = enginePower;
        this.productionDate = productionDate;
        this.automatic = automatic;
        this.drive = drive;
    }

    public CarBrand getMark() {
        return mark;
    }

    public void setMark(CarBrand mark) {
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CarType getType() {
        return type;
    }

    public void setType(CarType type) {
        this.type = type;
    }

    public double getCombustion() {
        return combustion;
    }

    public void setCombustion(double combustion) {
        this.combustion = combustion;
    }

    public double getEngineSize() {
        return engineSize;
    }

    public void setEngineSize(double engineSize) {
        this.engineSize = engineSize;
    }

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public void setNumberOfSeats(int numberOfSeats) {
        this.numberOfSeats = numberOfSeats;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public LocalDate getProductionDate() {
        return productionDate;
    }

    public void setProductionDate(LocalDate productionDate) {
        this.productionDate = productionDate;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public CarDrive getDrive() {
        return drive;
    }

    public void setDrive(CarDrive drive) {
        this.drive = drive;
    }

    @Override
    public String toString() {
        return mark.toString() +" " + name;
    }
}
