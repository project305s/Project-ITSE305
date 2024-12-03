import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/**
 * DataForgotPass class - Simulates the data access layer for user information.
 * This class manages user data and handles password reset functionality.
 */
public class DataForgotPass {

    // Simulated user database for demonstration purposes
    private Map<String, String> usersDatabase = new HashMap<>();
    private Map<String, String> resetTokens = new HashMap<>(); // Stores reset tokens

    public DataForgotPass() {
        // Adding sample users for demonstration
        usersDatabase.put("librarian@example.com", "librarianPassword");
        usersDatabase.put("member@example.com", "memberPassword");
    }

    /**
     * validateEmail - Checks if the provided email exists in the user database.
     *
     * @param email The email provided by the user
     * @return boolean indicating if the email exists
     */
    public boolean validateEmail(String email) {
        return email != null && usersDatabase.containsKey(email);
    }

    /**
     * generateResetToken - Generates a unique token for password reset and stores it.
     *
     * @param email The user's email address
     * @return String representing the reset token
     */
    public String generateResetToken(String email) {
        if (!validateEmail(email)) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        String token = UUID.randomUUID().toString(); // Generate a unique token
        resetTokens.put(token, email);
        return token;
    }

    /**
     * updatePassword - Updates the user's password in the database.
     *
     * @param email The user's email address
     * @param newPassword The new password to be set
     */
    public void updatePassword(String email, String newPassword) {
        if (!validateEmail(email)) {
            throw new IllegalArgumentException("Invalid email address.");
        }
        usersDatabase.put(email, newPassword);
    }
}
