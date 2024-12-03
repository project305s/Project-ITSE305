import java.util.Scanner;

/**
 * PresentationForgotPass class - Handles user interaction for the password reset process.
 * This class gathers user input and relays it to the business layer for processing.
 */
public class PresentationForgotPass {

    // Instance of BusinessForgotPass for processing password reset logic
    private BusinessForgotPass businessForgotPass = new BusinessForgotPass();

    /**
     * startPasswordReset - Begins the password reset process by prompting the user
     * to enter their email address for the reset request.
     */
    public void startPasswordReset() {
        try (Scanner scanner = new Scanner(System.in)) {
            // Prompt user for email
            System.out.println("Enter your registered email address:");
            String email = scanner.nextLine().trim();

            // Request password reset via business layer and provide feedback
            String result = businessForgotPass.requestPasswordReset(email);
            System.out.println(result);

            // If the reset link was sent successfully, ask for a new password
            if (result.startsWith("Password reset link sent")) {
                System.out.println("Enter your new password:");
                String newPassword = scanner.nextLine().trim();

                // Update the password
                String updateResult = businessForgotPass.resetPassword(email, newPassword);
                System.out.println(updateResult);
            }
        } catch (Exception e) {
            System.out.println("An error occurred: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        PresentationForgotPass presentationForgotPass = new PresentationForgotPass();
        presentationForgotPass.startPasswordReset();
    }
}
