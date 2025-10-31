public class WashingMachine extends Appliance {
    private double drumSize;

    public WashingMachine(String brand, int powerRating, double drumSize) {
        super(brand, powerRating);
        this.drumSize = drumSize;
    }

    public void showFeatures() {
        System.out.println("Washing Machine with " + drumSize + " kg drum.");
    }

    public void turnOn() {
        System.out.println("Washing Machine is now ON.");
    }

    public void turnOff() {
        System.out.println("Washing Machine is now OFF.");
    }
}
