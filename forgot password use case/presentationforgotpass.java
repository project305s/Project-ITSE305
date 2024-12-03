import java.util.Scanner;

/**
 * presentationforgotpass class - Handles user interaction for the password reset process.
 * This class gathers user input and relays it to the business layer for processing.
 */
public class PresentationForgotPass {

    private BusinessForgotPass businessForgotPass = new BusinessForgotPass();

    /**
     * startPasswordReset - Begins the password reset process.
     */
    public void startPasswordReset() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter email:");
        String email = scanner.nextLine();

        System.out.println(businessForgotPass.requestPasswordReset(email));

        System.out.println("Enter new password:");
        String newPassword = scanner.nextLine();

        System.out.println(businessForgotPass.resetPassword(email, newPassword));

        scanner.close(); // 
    }

    public static void main(String[] args) {
        PresentationForgotPass presentationForgotPass = new PresentationForgotPass();
        presentationForgotPass.startPasswordReset();
    }
}

