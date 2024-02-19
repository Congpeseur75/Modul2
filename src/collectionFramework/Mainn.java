package collectionFramework;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

class Products {
    private int id;
    private String name;
    private double price;

    public Products(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "ID: " + id + ", Name: " + name + ", Price: " + price;
    }
}

class ProductManagers {
    private ArrayList<Products> products;

    public ProductManagers() {
        products = new ArrayList<>();
    }

    public void addProduct(Products product) {
        products.add(product);
    }

    public void updateProduct(int id, double newPrice) {
        for (Products product : products) {
            if (product.getId() == id) {
                product.setPrice(newPrice);
                return;
            }
        }
        System.out.println("Product with ID " + id + " not found.");
    }

    public void removeProduct(int id) {
        products.removeIf(product -> product.getId() == id);
    }

    public void displayProducts() {
        for (Products product : products) {
            System.out.println(product);
        }
    }

    public Products findProductByName(String name) {
        for (Products product : products) {
            if (product.getName().equalsIgnoreCase(name)) {
                return product;
            }
        }
        return null;
    }

    public void sortProductsAscending() {
        Collections.sort(products, Comparator.comparing(Products::getPrice));
    }

    public void sortProductsDescending() {
        Collections.sort(products, Comparator.comparing(Products::getPrice).reversed());
    }
}
public class Mainn {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ProductManagers productManager = new ProductManagers();

        // Thêm sản phẩm mẫu
        productManager.addProduct(new Products(1, "Phone", 500));
        productManager.addProduct(new Products(2, "Laptop", 1000));
        productManager.addProduct(new Products(3, "Tablet", 300));

        int choice;
        do {
            System.out.println("\nMenu:");
            System.out.println("1. Add product");
            System.out.println("2. Update product price");
            System.out.println("3. Remove product");
            System.out.println("4. Display products");
            System.out.println("5. Find product by name");
            System.out.println("6. Sort products by price (ascending)");
            System.out.println("7. Sort products by price (descending)");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.print("Enter product ID: ");
                    int id = scanner.nextInt();
                    scanner.nextLine(); // Consume newline
                    System.out.print("Enter product name: ");
                    String name = scanner.nextLine();
                    System.out.print("Enter product price: ");
                    double price = scanner.nextDouble();
                    productManager.addProduct(new Products(id, name, price));
                    System.out.println("Product added successfully.");
                    break;
                case 2:
                    System.out.print("Enter product ID to update price: ");
                    int updateId = scanner.nextInt();
                    System.out.print("Enter new price: ");
                    double newPrice = scanner.nextDouble();
                    productManager.updateProduct(updateId, newPrice);
                    break;
                case 3:
                    System.out.print("Enter product ID to remove: ");
                    int removeId = scanner.nextInt();
                    productManager.removeProduct(removeId);
                    System.out.println("Product removed successfully.");
                    break;
                case 4:
                    System.out.println("List of products:");
                    productManager.displayProducts();
                    break;
                case 5:
                    System.out.print("Enter product name to find: ");
                    String findName = scanner.nextLine();
                    Products foundProduct = productManager.findProductByName(findName);
                    if (foundProduct != null) {
                        System.out.println("Product found: " + foundProduct);
                    } else {
                        System.out.println("Product not found.");
                    }
                    break;
                case 6:
                    productManager.sortProductsAscending();
                    System.out.println("Products sorted by price (ascending).");
                    break;
                case 7:
                    productManager.sortProductsDescending();
                    System.out.println("Products sorted by price (descending).");
                    break;
                case 8:
                    System.out.println("Exiting program...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number from 1 to 8.");
                    break;
            }
        } while (choice != 8);
    }
}
