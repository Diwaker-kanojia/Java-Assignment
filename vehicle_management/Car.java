public class Car extends Vehicle {
    private int numDoors;

    public Car(String brand, String model, int year, int numDoors) {
        super(brand, model, year);
        this.numDoors = numDoors;

    }

    public void startEngine() {
        System.out.println("Car engine started.");
    }

    public void displayInfo() {
        System.out.println("Brand: " + getBrand() +
                ",\nModel: " + getModel() +
                ",\nYear: " + getYear() +
                ",\nDoors: " + numDoors);
    }

}
