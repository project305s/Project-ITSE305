import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class logintest {

    private final buisnesslogin loginService = new buisnesslogin();

    // Test case for a valid librarian login
    @Test
    public void testValidLibrarianLogin() {
        String result = loginService.loginUser("librarian", "librarianPassword");
        assertEquals("Welcome to the Librarian Dashboard.", result);
    }

    // Test case for a valid member login
    @Test
    public void testValidMemberLogin() {
        String result = loginService.loginUser("member", "memberPassword");
        assertEquals("Welcome to the Member Dashboard.", result);
    }

    // Test case for an invalid username
    @Test
    public void testInvalidUsername() {
        String result = loginService.loginUser("unknownUser", "librarianPassword");
        assertEquals("Invalid username or password.", result);
    }

    // Test case for an invalid password
    @Test
    public void testInvalidPassword() {
        String result = loginService.loginUser("librarian", "wrongPassword");
        assertEquals("Invalid username or password.", result);
    }

    // Test case for both username and password being invalid
    @Test
    public void testInvalidUsernameAndPassword() {
        String result = loginService.loginUser("wrongUser", "wrongPassword");
        assertEquals("Invalid username or password.", result);
    }

    // Test case for empty username
    @Test
    public void testEmptyUsername() {
        String result = loginService.loginUser("", "librarianPassword");
        assertEquals("Invalid username or password.", result);
    }

    // Test case for empty password
    @Test
    public void testEmptyPassword() {
        String result = loginService.loginUser("librarian", "");
        assertEquals("Invalid username or password.", result);
    }

    // Test case for both username and password being empty
    @Test
    public void testEmptyUsernameAndPassword() {
        String result = loginService.loginUser("", "");
        assertEquals("Invalid username or password.", result);
    }

    // Test case for null username
    @Test
    public void testNullUsername() {
        String result = loginService.loginUser(null, "librarianPassword");
        assertEquals("Invalid username or password.", result);
    }

    // Test case for null password
    @Test
    public void testNullPassword() {
        String result = loginService.loginUser("librarian", null);
        assertEquals("Invalid username or password.", result);
    }

    // Test case for both username and password being null
    @Test
    public void testNullUsernameAndPassword() {
        String result = loginService.loginUser(null, null);
        assertEquals("Invalid username or password.", result);
    }
}
