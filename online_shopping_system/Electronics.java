public class Electronics extends Product implements Discountable {
    public Electronics(String name, double price) {
        super(name, price);
    }

    public double getDiscountedPrice() {
        double discount = getPrice() * 0.05;
        return getPrice() - discount;
    }

    public void displayDetails() {
        System.out.println("Electronics: " + getName() + " | Price: ₹" + getPrice());
    }
}
