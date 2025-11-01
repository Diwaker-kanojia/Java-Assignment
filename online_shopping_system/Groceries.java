public class Groceries extends Product implements Discountable {

    public Groceries(String name, double price) {
        super(name, price);
    }

    public double getDiscountedPrice() {
        double discount = getPrice() * 0.00;
        return getPrice() - discount;
    }

    public void displayDetails() {
        System.out.println("Groceries: " + getName() + " | Price: ₹" + getPrice());
    }
}
