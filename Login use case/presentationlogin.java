import java.util.Scanner;

/**
 * presentationlogin class - Handles user interaction for the login process.
 * This class gathers user input and relays it to the business layer for processing.
 * It also provides feedback to the user based on the outcome of the login attempt.
 */
public class presentationlogin {

    // Instance of buisnesslogin for processing login logic
    private buisnesslogin loginService = new buisnesslogin();

    /**
     * startLogin - Begins the login process by prompting the user
     * to enter their username and password, which are then passed to the business
     * layer for validation. Provides feedback to the user based on the login outcome.
     */
    public void startLogin() {
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for username
            System.out.println("Enter username:");
            String username = scanner.nextLine().trim();

            // Validate username input
            if (username.isEmpty()) {
                System.out.println("Username cannot be empty. Please try again.");
                return;
            }

            // Prompt user for password
            System.out.println("Enter password:");
            String password = scanner.nextLine().trim();

            // Validate password input
            if (password.isEmpty()) {
                System.out.println("Password cannot be empty. Please try again.");
                return;
            }

            // Login user via business layer and provide feedback
            String result = loginService.loginUser(username, password);
            System.out.println(result);
        }
    }

    public static void main(String[] args) {
        presentationlogin presentationLogin = new presentationlogin();
        presentationLogin.startLogin();
    }
}
