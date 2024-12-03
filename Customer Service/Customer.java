/**
 * The Customer class represents a customer in the online library system.
 * It contains customer attributes and provides methods to access and modify them.
 */
public class Customer {
    private int id;
    private final String name; // Made final to emphasize immutability for name
    private final String email; // Made final to emphasize immutability for email

    /**
     * Constructor to initialize a Customer object with a name and email.
     *
     * @param name  the name of the customer
     * @param email the email of the customer
     * @throws IllegalArgumentException if name or email is null/empty
     */
    public Customer(String name, String email) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be null or empty");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer email cannot be null or empty");
        }

        this.name = name;
        this.email = email;
    }

    /**
     * Gets the ID of the customer.
     *
     * @return the customer ID
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the ID of the customer.
     *
     * @param id the customer ID to set
     * @throws IllegalArgumentException if the ID is less than or equal to zero
     */
    public void setId(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Customer ID must be greater than zero");
        }
        this.id = id;
    }

    /**
     * Gets the name of the customer.
     *
     * @return the customer name
     */
    public String getName() {
        return name;
    }

    /**
     * Gets the email of the customer.
     *
     * @return the customer email
     */
    public String getEmail() {
        return email;
    }

    /**
     * Returns a string representation of the customer object.
     *
     * @return a string describing the customer
     */
    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
