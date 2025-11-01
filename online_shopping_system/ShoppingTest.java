public class ShoppingTest {
    public static void main(String[] args) {
        Electronics e1 = new Electronics("Laptop", 60000);
        Clothing c1 = new Clothing("Shirt", 1500);
        Groceries g1 = new Groceries("Rice (10kg)", 800);

        Customer customer = new Customer("Ravi Kumar", 5);

        customer.addProduct(e1);
        customer.addProduct(c1);
        customer.addProduct(g1);

        customer.showBill();

    }
}
