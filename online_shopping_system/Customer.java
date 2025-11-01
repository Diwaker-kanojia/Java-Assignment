public class Customer {
    private String customerName;
    Product[] products;
    private int productCount;

    public Customer(String customerName, int maxProducts) {
        this.customerName = customerName;
        products = new Product[maxProducts];
        productCount = 0;
    }

    public void addProduct(Product p) {
        if (productCount >= products.length) {
            System.out.println("Cart is full. Cannot add more products.");
        } else {
            products[productCount++] = p;
        }
    }

    public void showBill() {
        System.out.println("Customer : " + customerName);
        System.out.println("Purchased Products:");
        double totalAmount = 0;
        double totalDiscount = 0;

        for (int i = 0; i < productCount; i++) {
            Product product = products[i];
            product.displayDetails();

            double discountedPrice = product.getDiscountedPrice();
            System.out.println("Discounted Price: ₹" + discountedPrice);

            totalAmount += product.getPrice();
            totalDiscount += (product.getPrice() - discountedPrice);
        }

        double totalPayable = totalAmount - totalDiscount;
        System.out.println("\nTotal Amount: ₹" + totalAmount);
        System.out.println("Total Discount: ₹" + totalDiscount);
        System.out.println("Total Payable Amount: ₹" + totalPayable);
    }

}
