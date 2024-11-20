import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class forgotpasstest {

    private final buisnessforgotpass forgotPassService = new buisnessforgotpass();

    // Test case for valid email requesting a password reset
    @Test
    public void testValidEmailPasswordResetRequest() {
        String result = forgotPassService.requestPasswordReset("librarian@example.com");
        assertTrue(result.startsWith("Password reset link sent to librarian@example.com"));
    }

    // Test case for invalid email requesting a password reset
    @Test
    public void testInvalidEmailPasswordResetRequest() {
        String result = forgotPassService.requestPasswordReset("unknown@example.com");
        assertEquals("Email address not found.", result);
    }

    // Test case for valid email and password update
    @Test
    public void testValidPasswordUpdate() {
        String email = "member@example.com";
        String newPassword = "newMemberPassword";
        String resetToken = forgotPassService.requestPasswordReset(email);
        assertTrue(resetToken.startsWith("Password reset link sent"));
        String updateResult = forgotPassService.resetPassword(email, newPassword);
        assertEquals("Password successfully updated.", updateResult);
    }

    // Test case for invalid email when updating password
    @Test
    public void testInvalidEmailPasswordUpdate() {
        String result = forgotPassService.resetPassword("unknown@example.com", "newPassword");
        assertEquals("Password successfully updated.", result); // Assuming update doesn't throw an error for invalid emails
    }

    // Test case for empty email
    @Test
    public void testEmptyEmailPasswordResetRequest() {
        String result = forgotPassService.requestPasswordReset("");
        assertEquals("Email address not found.", result);
    }

    // Test case for null email
    @Test
    public void testNullEmailPasswordResetRequest() {
        String result = forgotPassService.requestPasswordReset(null);
        assertEquals("Email address not found.", result);
    }

    // Test case for requesting password reset multiple times
    @Test
    public void testMultiplePasswordResetRequests() {
        String email = "librarian@example.com";
        forgotPassService.requestPasswordReset(email);
        String secondRequest = forgotPassService.requestPasswordReset(email);
        assertTrue(secondRequest.startsWith("Password reset link sent"));
    }

    // Test case for valid password update with a weak new password
    @Test
    public void testWeakPasswordUpdate() {
        String email = "librarian@example.com";
        String result = forgotPassService.resetPassword(email, "123");
        assertEquals("Password successfully updated.", result); // Assuming no strength checks are in place
    }

    // Test case for valid password update with empty new password
    @Test
    public void testEmptyPasswordUpdate() {
        String email = "librarian@example.com";
        String result = forgotPassService.resetPassword(email, "");
        assertEquals("Password successfully updated.", result);
    }

    // Test case for valid password update with null new password
    @Test
    public void testNullPasswordUpdate() {
        String email = "librarian@example.com";
        String result = forgotPassService.resetPassword(email, null);
        assertEquals("Password successfully updated.", result);
    }
}
