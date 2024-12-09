package data;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

public class UserRepository {

    private final Map<String, String> users = new ConcurrentHashMap<>();

    public boolean userExists(String username) {
        return users.containsKey(username);
    }

    public void saveUser(String username, String password) {
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username and password cannot be null.");
        }
        // Simulated password storage (not secure for real-world applications)
        users.put(username, "hashed_" + password); // Simulates hashing
    }

    public boolean validatePassword(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        String storedHashedPassword = users.get(username);
        return storedHashedPassword != null && storedHashedPassword.equals("hashed_" + password);
    }
}
