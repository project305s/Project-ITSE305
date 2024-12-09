package business;

import data.UserRepository;

public class RegistrationService {
    private static final int MIN_PASSWORD_LENGTH = 8;
    private final UserRepository userRepository;

    // Constructor injection for better testability and decoupling
    public RegistrationService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    private boolean isValidPassword(String password) {
        return password != null && password.length() >= MIN_PASSWORD_LENGTH;
    }

    public boolean registerUser(String username, String password) {
        if (username == null || username.isBlank()) {
            throw new IllegalArgumentException("Username cannot be null or empty.");
        }
        if (password == null || password.length() < MIN_PASSWORD_LENGTH) {
            throw new IllegalArgumentException("Password must be at least 8 characters long.");
        }

        if (userRepository.userExists(username)) {
            return false;
        }

        userRepository.saveUser(username, password);
        return true;
    }
}
