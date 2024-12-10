import java.util.ArrayList;
import java.util.Scanner;

public class Customer {
    private final Admin admin;
    private final ArrayList<Product> cart = new ArrayList<>();
    private final Scanner scn = new Scanner(System.in);

    public Customer(Admin admin) {
        this.admin = admin;
    }

    public void customerMenu() {
        int choice;
        while (true) {
            System.out.println("\n--- Welcome to Seven Evelyn Store Customer Panel ---");
            System.out.println("1. View Products");
            System.out.println("2. Add to Cart");
            System.out.println("3. View Cart");
            System.out.println("4. Checkout");
            System.out.println("0. Back to Main Menu");
            System.out.print("Enter your choice: ");
            choice = scn.nextInt();

            switch (choice) {
                case 1:
                    admin.viewProducts();
                    break;
                case 2:
                    addToCart();
                    break;
                case 3:
                    viewCart();
                    break;
                case 4:
                    checkout();
                    break;
                case 0:
                    return;
                default:
                    System.out.println("Invalid choice.  try again.");
            }
        }
    }

    private void addToCart() {
        admin.viewProducts();
        System.out.print("Enter product number to add to cart: ");
        int index = scn.nextInt() - 1;
        if (index >= 0 && index < admin.getProducts().size()) {
            Product product = admin.getProducts().get(index);
            if (product.getStock() > 0) {


                    System.out.print("Pila Kabook? ");
                    int quantity = scn.nextInt();
                         if (quantity <= product.getStock()) {
                        cart.add(new Product(product.getName(), product.getPrice(), quantity));
                        product.setStock(product.getStock() - quantity);
                        System.out.println("Added to cart successfully!");

                    }
                         else {
                        System.out.println("Not enough stock. Available: " + product.getStock());
                    }

            } else {
                System.out.println("Way Stock Mamser");
            }
        } else {
            System.out.println("Invalid product number.");
        }
    }


    private void viewCart() {
        if (cart.isEmpty()) {
            System.out.println("Your cart is empty.");
            return;
        } else {

            System.out.println("Imo Basket:");
            float total = 0;
            for (int i = 0; i < cart.size(); i++) {
                Product product = cart.get(i);
                System.out.println(product);
                total += product.getPrice() * product.getStock();
            }
            System.out.println("Total: $" + total);
        }
    }

    private void checkout() {
        if (cart.isEmpty()) {
            System.out.println("Way sud imo Basket");
            return;
        } else {

            System.out.println("--- Checkout ---");
            float total = 0;
            for (int i = 0; i < cart.size(); i++) {
                Product product = cart.get(i);
                System.out.println(product);
                total += product.getPrice() * product.getStock();
            }
            System.out.println("Total Cost: PHP " + total);



                System.out.print("Enter your kwarta (payment): PHP ");
                double kwarta = scn.nextDouble();

                if (kwarta >= total) {
                    System.out.println("Payment successful! Change: PHP " + (kwarta - total));
                    cart.clear();
                
                } else {
                    System.out.println("Insufficient kwarta. Transaction cancelled.");
                }
            }
        }
    }

