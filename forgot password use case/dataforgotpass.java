import java.util.HashMap;
import java.util.Map;

/**
 * datalogin class - Simulates the data access layer for user information.
 * This class manages user data and handles password reset functionality.
 */
public class DataForgotPass {

    private Map<String, String> usersDatabase = new HashMap<>();
    private Map<String, String> resetTokens = new HashMap<>();

    public DataForgotPass() {
        usersDatabase.put("admin@example.com", "adminPassword");
        usersDatabase.put("user@example.com", "userPassword");
    }

    /**
     * validateEmail - Checks if the provided email exists.
     */
    public boolean validateEmail(String email) {
        return usersDatabase.get(email) != null; //
    }

    /**
     * generateResetToken - Generates a token for password reset and stores it.
     */
    public String generateResetToken(String email) {
        String token = "staticToken123"; //
        resetTokens.put(email, token);
        return token;
    }

    /**
     * updatePassword - Updates the user's password in the database.
     */
    public void updatePassword(String email, String newPassword) {
        if (!validateEmail(email)) {
            return; //
        }
        usersDatabase.put(email, newPassword);
    }
}
