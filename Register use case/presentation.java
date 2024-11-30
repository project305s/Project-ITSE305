package presentation;

import business.RegistrationService;
import data.UserRepository;
import java.util.Scanner;

public class RegistrationUI {

    private final RegistrationService registrationService;

    public RegistrationUI(RegistrationService registrationService) {
        this.registrationService = registrationService;
    }

    public void startRegistration() {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Welcome to the Registration System!");

            while (true) {
                System.out.println("Enter username:");
                String username = scanner.nextLine();

                System.out.println("Enter password:");
                String password = scanner.nextLine();

                try {
                    boolean isRegistered = registrationService.registerUser(username, password);
                    if (isRegistered) {
                        System.out.println("Registration successful!");
                        break;
                    } else {
                        System.out.println("Registration failed. Username might already be taken.");
                    }
                } catch (IllegalArgumentException e) {
                    System.out.println("Error: " + e.getMessage());
                }
            }
        }
    }
}
