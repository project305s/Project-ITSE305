# Library Management System - Use Cases

## Use Case 1: User Login

### Purpose:
This use case describes how a registered user logs into the Library Management System.

### Primary Actor:
- **User** (either a member or a librarian)

### Preconditions:
- The user must have an active account in the system.

### Workflow:
1. The user accesses the login page.
2. The system prompts the user to enter their **username/email** and **password**.
3. The user inputs their login credentials and submits them.
4. The system validates the credentials against the database.
5. If the credentials are correct:
   - The librarian is taken to the **Librarian Dashboard** for management purposes.
   - The member is taken to the **Member Dashboard** to view and borrow books.
6. Upon successful login, the user can access relevant system features.

### Alternate Scenario:
- **Invalid Login**:
  1. If the credentials are invalid, the system shows the message: "Invalid username or password."
  2. The user can attempt to log in again or select "Forgot Password."

### Postconditions:
- The user is authenticated and granted access to their respective dashboard.

### Exceptions:
- **Database Unavailable**: If the system cannot verify the credentials due to a technical issue, an error message is displayed, asking the user to try again later.

---

## Use Case 2: Forgot Password 

### Purpose:
This use case outlines the steps for users to recover their password if they have forgotten it.

### Primary Actor:
- **User** (either a member or a librarian)

### Preconditions:
- The user must have an account in the system, registered with a valid email.

### Workflow:
1. The user clicks on the "Forgot Password" link on the login page.
2. The system prompts the user to enter their **registered email address**.
3. The user submits the email address.
4. The system checks if the email exists in the database.
5. If the email is valid, the system sends a **password reset link** to the user’s email.
6. The user clicks on the link in the email, which takes them to the password reset page.
7. The user creates a new password, confirms it, and submits the form.
8. The system updates the password and confirms that the reset is successful.
9. The user can now log in with the new password.

### Alternate Scenario:
- **Unrecognized Email**:
  1. If the email is not found in the system, an error is shown: "Email address not found."
  2. The user is prompted to enter a valid email or contact support.

### Postconditions:
- The user’s password is successfully updated, and they can access the system with the new credentials.

### Exceptions:
- **Email Not Delivered**: If the reset email fails to send, the system informs the user to try again later.
- **Expired Link**: If the reset link expires, the user must restart the process.

