package data;

import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;
import java.util.Objects;
import org.mindrot.jbcrypt.BCrypt;

public class UserRepository {

    private final Map<String, String> users = new ConcurrentHashMap<>();

    public boolean userExists(String username) {
        return users.containsKey(username);
    }

    public void saveUser(String username, String password) 
    {
        if (username == null || password == null) {
            throw new IllegalArgumentException("Username and password cannot be null.");
        }

        String hashedPassword = BCrypt.hashpw(password, BCrypt.gensalt());
        users.put(username, hashedPassword);
    }

     /*
     * return true if the password is correct, false otherwise
    */
    public boolean validatePassword(String username, String password) {
        if (username == null || password == null) {
            return false;
        }
        String storedHashedPassword = users.get(username);
        return storedHashedPassword != null && BCrypt.checkpw(password, storedHashedPassword);
    }


    

}
