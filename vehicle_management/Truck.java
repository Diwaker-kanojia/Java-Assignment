public class Truck extends Vehicle {
    private double maxLoadCapacity;

    public Truck(String brand, String model, int year, double maxLoadCapacity) {
        super(brand, model, year);
        this.maxLoadCapacity = maxLoadCapacity;
    }

    @Override
    public void startEngine() {
        System.out.println("Truck’s engine started running.");
    }

    @Override
    public void displayInfo() {
        System.out.println("Brand: " + getBrand() +
                ",\nModel: " + getModel() +
                ",\nYear: " + getYear() +
                ",\nMaximum Load Capacity: " + maxLoadCapacity + "kg");
    }
}
