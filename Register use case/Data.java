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

    

}
