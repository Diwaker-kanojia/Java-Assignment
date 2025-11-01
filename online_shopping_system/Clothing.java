public class Clothing extends Product implements Discountable {

    public Clothing(String name, double price) {
        super(name, price);
    }

    public double getDiscountedPrice() {
        double discount = getPrice() * 0.10;
        return getPrice() - discount;
    }

    public void displayDetails() {
        System.out.println("Clothing: " + getName() + " | Price: ₹" + getPrice());
    }
}
