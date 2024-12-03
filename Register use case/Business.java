package business;

import data.UserRepository;

public class RegistrationService 
{

    private final UserRepository userRepository;

    // Constructor injection for better testability and decoupling
    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public boolean registerUser(String username, String password) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }
        if (password == null || password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }

        if (userRepository.userExists(username)) {
            return false;
        }

        userRepository.saveUser(username, password);
        return true;

    /**
     * Checks if a Username is valid.
     */
          private boolean isValidUsername(String username)
         {
        return username != null && username.trim().length() >= 3;
            }

    /**
      * Checks if a password is valid.
     */
    private boolean isValidPassword(String password) 
    {
        return password != null && password.length() >= MIN_PASSWORD_LENGTH;
    }

}
