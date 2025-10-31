public abstract class Appliance implements PowerControl {
    private String brand;
    private int powerRating;

    public Appliance(String brand, int powerRating) {
        this.brand = brand;
        this.powerRating = powerRating;
    }

    public abstract void showFeatures();

    public void displayInfo() {
        System.out.println("Brand :" + brand +
                "\nPower Rating : " + powerRating);
    }

}
