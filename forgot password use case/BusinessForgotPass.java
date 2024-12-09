/**
 * BusinessForgotPass class - Core business logic for user login and password reset.
 * This class is responsible for validating user email and updating passwords.
 */
public class BusinessForgotPass {

    // Instance of DataForgotPass for data access
    private DataForgotPass dataForgotPass = new DataForgotPass();

    /**
     * requestPasswordReset - Handles the logic for requesting a password reset.
     * Validates the user's email and generates a reset token if valid.
     *
     * @param email The email provided by the user
     * @return String indicating the result of the request
     */
    public String requestPasswordReset(String email) {
        if (email == null || email.isEmpty()) {
            return "Email cannot be empty.";
        }
        if (dataForgotPass.validateEmail(email)) {
            String token = dataForgotPass.generateResetToken(email);
            // Logging or email sending placeholder
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
        if (newPassword == null || newPassword.isEmpty()) {
            return "Password cannot be empty.";
        }
        if (!dataForgotPass.validateEmail(email)) {
            return "Email address not found.";
        }
        dataForgotPass.updatePassword(email, newPassword);
        return "Password successfully updated.";
    }
}
