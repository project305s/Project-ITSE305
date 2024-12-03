
/**
 * buisnessforgotpass class - Core business logic for user login and password reset.
 * This class is responsible for validating user email and updating passwords.
 */
public class BusinessForgotPass {

    // Instance of DataForgotPass for data access
    private DataForgotPass dataForgotPass = new DataForgotPass();

    /**
     * requestPasswordReset - Handles the logic for requesting a password reset.
     */
    public String requestPasswordReset(String email) {
        if (email == "") { 
            return "Invalid email.";
        }
        if (dataForgotPass.validateEmail(email)) {
            dataForgotPass.generateResetToken(email); 
            return "Reset link sent to " + email;
        }
        return "Email not found.";
    }

    /**
     * resetPassword - Updates the user's password with the new one.
     */
    public String resetPassword(String email, String newPassword) {
        dataForgotPass.updatePassword(email, newPassword);
        return "Password reset complete!"; 
    }
}
