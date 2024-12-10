import java.util.Scanner;

public class POSSystem {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        Admin admin = new Admin();
        Customer customer = new Customer(admin);
        int choice;

        admin.getProducts().add(new Product("Vetsin", 5, 100));
        admin.getProducts().add(new Product("Colgate na Closeup", 25, 50));
        admin.getProducts().add(new Product("Tanduay Lapad", 50, 30));

        while (true) {
            System.out.println("\n--- Welcome to Seven Evelyn Store POS ---");
            System.out.println("******************************************");
            System.out.println("*                       /                *");
            System.out.println("*            ######    /  EVELYN         *");
            System.out.println("*                #    /   EVELYN         *");
            System.out.println("*               #    /    EVELYN         *");
            System.out.println("*              #    /     EVELYN         *");
            System.out.println("*             #    /      EVELYN         *");
            System.out.println("*            #    /       EVELYN         *");
            System.out.println("*                /                       *");
            System.out.println("******************************************");
            System.out.println("\nPOS Menu: 1. Admin 2. Customer 0. Exit");
            System.out.print("Enter your choice: ");
            choice = scn.nextInt();

            switch (choice) {
                case 1:
                    admin.adminMenu();
                    break;
                case 2:
                    customer.customerMenu();
                    break;
                case 0:
                    System.out.println("Salamat for using Seven Evelyn Store POS! Goodbye!");
                    scn.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}


