import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * The PresentationLayer class represents the user interface for the customer service
 * operations in the online library system. It interacts with the user and handles
 * input/output.
 */
public class PresentationLayer {
    private final BusinessLayer businessLayer;
    private final Scanner scanner;

    /**
     * Constructor initializes the business layer and the input scanner.
     */
    public PresentationLayer() {
        this.businessLayer = new BusinessLayer(new DataLayer());
        this.scanner = new Scanner(System.in);
    }

    /**
     * Displays the main menu for customer service options.
     */
    public void displayMenu() {
        while (true) { // Loop to keep displaying the menu
            System.out.println("\nWelcome to the Online Library Customer Service");
            System.out.println("1. Register Customer");
            System.out.println("2. View Customer Details");
            System.out.println("3. Exit");
            System.out.print("Select an option: ");

            try {
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline
                switch (choice) {
                    case 1 -> registerCustomer();
                    case 2 -> viewCustomerDetails();
                    case 3 -> {
                        System.out.println("Exiting... Thank you!");
                        return; // Exit the application
                    }
                    default -> System.out.println("Invalid choice. Please select a valid option.");
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please enter a number.");
                scanner.nextLine(); // Clear invalid input
            }
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

        try {
            Customer customer = businessLayer.registerCustomer(name, email);
            System.out.println("Customer Registered Successfully: " + customer);
        } catch (IllegalArgumentException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Displays details of a customer.
     */
    private void viewCustomerDetails() {
        System.out.print("Enter Customer ID: ");
        try {
            int customerId = scanner.nextInt();
            scanner.nextLine(); // Consume newline
            Customer customer = businessLayer.getCustomerDetails(customerId);

            if (customer != null) {
                System.out.println("Customer Details: " + customer);
            } else {
                System.out.println("Customer not found.");
            }
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Customer ID must be a number.");
            scanner.nextLine(); // Clear invalid input
        }
    }

    /**
     * Main method to start the application.
     *
     * @param args command-line arguments (not used)
     */
    public static void main(String[] args) {
        PresentationLayer ui = new PresentationLayer();
        ui.displayMenu();
    }
}
