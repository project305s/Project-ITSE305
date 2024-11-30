
import java.util.HashMap;
import java.util.Map;

/**
 * public class datalogin {

 }
 // datalogin.java class - Simulates the data access layer for user information.
 * This class manages user data and handles login credential validation.
 */
public class datalogin {

    // Simulated user database for demonstration purposes
    private Map<String, String> usersDatabase = new HashMap<>();
    private Map<String, String> userRoles = new HashMap<>();

    public datalogin() {
        // Adding sample users for demonstration
        usersDatabase.put("librarian", "librarianPassword");
        usersDatabase.put("member", "memberPassword");

        // Adding roles for users
        userRoles.put("librarian", "Librarian");
        userRoles.put("member", "Member");
    }

    /**
     * validateUser - Checks if the provided username and password match a registered user.
     *
     * @param username The username provided by the user
     * @param password The password provided by the user
     * @return boolean indicating if the login was successful
     */
    public boolean validateUser(String username, String password) {
        return usersDatabase.containsKey(username) && usersDatabase.get(username).equals(password);
    }

    /**
     * getUserRole - Retrieves the role of a given user.
     *
     * @param username The username whose role needs to be fetched
     * @return String indicating the user's role, or null if the user doesn't exist
     */
    public String getUserRole(String username) {
        return userRoles.get(username);
    }
}

