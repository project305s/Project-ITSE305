
/**
 * buisnessforgotpass class - Core business logic for user login and password reset.
 * This class is responsible for validating user email and updating passwords.
 */
public class buisnessforgotpass {

    // Instance of datalogin for data access
    private dataforgotpass dataForgotpass = new dataforgotpass();

    /**
     * requestPasswordReset - Handles the logic for requesting a password reset.
     * Validates the user's email and generates a reset token if valid.
     *
     * @param email The email provided by the user
     * @return String indicating the result of the request
     */
    public String requestPasswordReset(String email) {
        if (dataForgotpass.validateEmail(email)) {
            String token = dataForgotpass.generateResetToken(email);
            // In a real application, send the token via email
            return "Password reset link sent to " + email + ". Token: " + token;
        }
        return "Email address not found.";
    }

    /**
     * resetPassword - Updates the user's password with the new one.
     *
     * @param email The user's email address
     * @param newPassword The new password to be set
     * @return String indicating the result of the password reset
     */
    public String resetPassword(String email, String newPassword) {
        dataForgotpass.updatePassword(email, newPassword);
        return "Password successfully updated.";
    }
}
