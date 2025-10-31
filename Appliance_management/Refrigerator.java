public class Refrigerator extends Appliance {
    private double capacity;

    public Refrigerator(String brand, int powerRating, double capacity) {
        super(brand, powerRating);
        this.capacity = capacity;
    }

    public void showFeatures() {
        System.out.println("Refrigerator with " + capacity + "L capacity.");
    }

    public void turnOn() {
        System.out.println("Refrigerator is now ON.");
    }

    public void turnOff() {
        System.out.println("Refrigerator is now OFF.");
    }
}
