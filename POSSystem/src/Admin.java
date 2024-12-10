import java.util.ArrayList;
import java.util.Scanner;

public class Admin {
    private final ArrayList<Product> products = new ArrayList<>();
    private final Scanner scn = new Scanner(System.in);

    public void adminMenu() {
        int choice;
        while (true) {
            System.out.println("\n--- Seven Evelyn Store Admin Panel ---");
            System.out.println("1. Add Product");
            System.out.println("2. Update Price");
            System.out.println("3. Update Stock");
            System.out.println("4. View Product List");
            System.out.println("5. Delete Product");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scn.nextInt();

            switch (choice) {
                case 1:
                    addProduct();
                    break;
                case 2:
                    updatePrice();
                    break;
                case 3:
                    updateStock();
                    break;
                case 4:
                    viewProducts();
                    break;
                case 5:
                    deleteProduct();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }

    private void addProduct() {
        System.out.print("Enter Product Name: ");
        scn.nextLine();
        String name = scn.nextLine();
        System.out.print("Enter Product Price: ");
        float price = scn.nextFloat();
        System.out.print("Enter Stock Quantity: ");
        int quantity = scn.nextInt();

        products.add(new Product(name, price, quantity));
        System.out.println("Product added successfully!");
    }

    private void updatePrice() {
        viewProducts();
        System.out.print("Enter product number to update price: ");
        int index = scn.nextInt() - 1;
        if (index >= 0 && index < products.size())  {
            System.out.print("Enter new price: ");
            float price = scn.nextFloat();
            products.get(index).setPrice(price);
            System.out.println("Price updated successfully!");
        } else {
            System.out.println("Invalid product number.");
        }
    }

    private void updateStock() {
        viewProducts();
        System.out.print("Enter product number to update stock: ");
        int index = scn.nextInt() - 1;
        if (index >= 0 && index < products.size())  {
            System.out.print("Enter new stock quantity: ");
            int stock = scn.nextInt();
            products.get(index).setStock(stock);
            System.out.println("Stock updated successfully!");
        } else {
            System.out.println("Invalid product number.");
        }
    }

    public void viewProducts() {
        if (products.isEmpty()) {
            System.out.println("No products available.");
            return;
        }

        System.out.println("Product List:");
        for (int i = 0; i < products.size(); i++) {
            Product p = products.get(i);
            System.out.println((i + 1) + ". " + p);
        }
    }
    private void deleteProduct() {
        if (products.isEmpty()) {
            System.out.println("No products available to delete.");
            return;
        }

        viewProducts();
        System.out.print("Enter the product number to delete: ");
        int index = scn.nextInt() - 1;

        if (index >= 0 && index < products.size())  {
            Product removedProduct = products.remove(index);
            System.out.println("Product '" + removedProduct.getName() + "' has been deleted successfully.");
        } else {
            System.out.println("Invalid product number. Please try again.");
        }
    }

    public ArrayList<Product> getProducts() {
        return products;
    }


}
