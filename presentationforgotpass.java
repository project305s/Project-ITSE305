

import java.util.Scanner;

/**
 * presentationforgotpass class - Handles user interaction for the password reset process.
 * This class gathers user input and relays it to the business layer for processing.
 */
public class presentationforgotpass {

    // Instance of businesslogin for processing password reset logic
    private buisnessforgotpass buisnessForgotpass = new buisnessforgotpass();

    /**
     * startPasswordReset - Begins the password reset process by prompting the user
     * to enter their email address for the reset request.
     */
    public void startPasswordReset() {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for email
        System.out.println("Enter your registered email address:");
        String email = scanner.nextLine();

        // Request password reset via business layer and provide feedback
        String result = buisnessForgotpass.requestPasswordReset(email);
        System.out.println(result);

        // If the reset link was sent successfully, ask for a new password
        if (result.startsWith("Password reset link sent")) {
            System.out.println("Enter your new password:");
            String newPassword = scanner.nextLine();
            String updateResult = buisnessForgotpass.resetPassword(email, newPassword);
            System.out.println(updateResult);
        }

        // Close the scanner resource
        scanner.close();
    }

    public static void main(String[] args) {
        presentationforgotpass presentationForgotpass = new presentationforgotpass();
        presentationForgotpass.startPasswordReset();
    }
}
