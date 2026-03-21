package Day12As7;

class Product {
    int productId;
    String productName;
    double price;
    int quantity;

    // Parameterized Constructor
    Product(int id, String name, double p, int q) {
        productId = id;
        productName = name;
        price = p;
        quantity = q;
    }

    // Method to calculate total price
    double calculateTotalPrice() {
        return price * quantity;
    }
}

public class ProductMulti {
    public static void main(String[] args) {

        // Creating 2 product objects
        Product p1 = new Product(1, "Laptop", 50000, 2);
        Product p2 = new Product(2, "Mobile", 20000, 3);

        // Printing total price
        System.out.println("Total Price of " + p1.productName + ": " + p1.calculateTotalPrice());
        System.out.println("Total Price of " + p2.productName + ": " + p2.calculateTotalPrice());
    }
}