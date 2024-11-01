

// buisnesslogin.java
/**
 * buisnesslogin class - Core business logic for user login.
 * This class is responsible for validating user credentials and determining
 * the next steps based on user roles.
 */
public class buisnesslogin {

 
    private datalogin dataLogin = new datalogin();

    /**
     * loginUser - Handles the login logic for a user.
     * Validates the user's credentials and determines if the login is successful.
     *
     * @param username The username provided by the user
     * @param password The password provided by the user
     * @return String indicating the user's role if login is successful, or an error message
     */
    public String loginUser(String username, String password) {
        // Validate credentials
        if (dataLogin.validateUser(username, password)) {
            // Check user role (for simplicity, based on username)
            if ("librarian".equals(username)) {
                return "Welcome to the Librarian Dashboard.";
            } else if ("member".equals(username)) {
                return "Welcome to the Member Dashboard.";
            }
        }
        // Return error message for invalid credentials
        return "Invalid username or password.";
    }
}
