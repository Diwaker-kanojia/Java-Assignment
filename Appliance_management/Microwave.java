public class Microwave extends Appliance {
    private boolean hasGrill;

    public Microwave(String brand, int powerRating, boolean hasGrill) {
        super(brand, powerRating);
        this.hasGrill = hasGrill;
    }

    @Override
    public void showFeatures() {
        if (hasGrill)
            System.out.println("Microwave with Grill.");
        else
            System.out.println("Microwave without Grill.");
    }

    @Override
    public void turnOn() {
        System.out.println("Microwave is heating now.");
    }

    @Override
    public void turnOff() {
        System.out.println("Microwave is turned off.");
    }
}
