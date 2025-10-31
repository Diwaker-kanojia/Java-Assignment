public class Bike extends Vehicle {
    private String bikeType;

    public Bike(String brand, String model, int year, String bikeType) {
        super(brand, model, year);
        this.bikeType = bikeType;
    }

    @Override
    public void startEngine() {
        System.out.println("Bike engine started.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + getBrand() +
                ",\nModel: " + getModel() +
                ",\nYear: " + getYear() +
                ",\nBike Type: " + bikeType);
    }
}
