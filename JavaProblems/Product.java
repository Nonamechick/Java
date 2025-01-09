public class Product {
    private String name;
    private double price;
    private int quantity;

    // Constructor
    public Product(String name, double price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public double calculateTotalValue() {
        return price * quantity;
    }

    public static void main(String[] args) {
        Product product1 = new Product("Laptop", 1000, 3);
        Product product2 = new Product("Phone", 500, 5);

        System.out.println("Total value of product 1: $" + product1.calculateTotalValue());
        System.out.println("Total value of product 2: $" + product2.calculateTotalValue());
    }
}
