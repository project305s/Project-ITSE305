/**
 * The BusinessLayer  class represents the user interface for the customer service
 * operations in the online library system. It interacts with the user and handles
 * input/output.
 */
import java.util.Scanner;

public class PresentationLayer {
    private BusinessLayer  BusinessLayer ;
    private Scanner scanner;

    public PresentationLayer() {
        this.BusinessLayer  = new BusinessLayer (new DataLayer());
        this.scanner = new Scanner(System.in);
    }

    /**
     * Displays the main menu for customer service options.
     */
    public void displayMenu() {
        System.out.println("Welcome to the Online Library Customer Service");
        System.out.println("1. Register Customer");
        System.out.println("2. View Customer Details");
        System.out.println("3. Exit");
        System.out.print("Select an option: ");
        
        int choice = scanner.nextInt();
        scanner.nextLine(); // Consume newline

        switch (choice) {
            case 1:
                registerCustomer();
                break;
            case 2:
                viewCustomerDetails();
                break;
            case 3:
                System.out.println("Exiting...");
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                displayMenu();
        }
    }

    /**
     * Handles customer registration.
     */
    private void registerCustomer() {
        System.out.print("Enter Customer Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Customer Email: ");
        String email = scanner.nextLine();
        
        Customer customer = BusinessLayer .registerCustomer(name, email);
        System.out.println("Customer Registered: " + customer);
        displayMenu();
    }

    /**
     * Displays details of a customer.
     */
    private void viewCustomerDetails() {
        System.out.print("Enter Customer ID: ");
        int customerId = scanner.nextInt();
        
        Customer customer = BusinessLayer .getCustomerDetails(customerId);
        if (customer != null) {
            System.out.println("Customer Details: " + customer);
        } else {
            System.out.println("Customer not found.");
        }
        displayMenu();
    }

    public static void main(String[] args) {
        PresentationLayer ui = new PresentationLayer();
        ui.displayMenu();
    }
}
