/**
 * The BusinessLayer class provides business logic for customer-related operations
 * in the online library system. It interacts with the data layer to perform actions.
 */
public class BusinessLayer {
    private final DataLayer dataLayer;

    /**
     * Constructor to initialize the business layer with a data layer dependency.
     *
     * @param dataLayer the data layer object used for database operations
     */
    public BusinessLayer(DataLayer dataLayer) {
        if (dataLayer == null) {
            throw new IllegalArgumentException("DataLayer cannot be null");
        }
        this.dataLayer = dataLayer;
    }

    /**
     * Registers a new customer and saves it to the repository.
     *
     * @param name  the name of the customer
     * @param email the email of the customer
     * @return the registered Customer object
     * @throws IllegalArgumentException if name or email is null/empty
     */
    public Customer registerCustomer(String name, String email) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer name cannot be null or empty");
        }
        if (email == null || email.trim().isEmpty()) {
            throw new IllegalArgumentException("Customer email cannot be null or empty");
        }

        Customer customer = new Customer(name, email);
        dataLayer.save(customer);
        return customer;
    }

    /**
     * Retrieves customer details based on the customer ID.
     *
     * @param customerId the ID of the customer to retrieve
     * @return the Customer object if found, otherwise null
     * @throws IllegalArgumentException if the customer ID is less than or equal to zero
     */
    public Customer getCustomerDetails(int customerId) {
        if (customerId <= 0) {
            throw new IllegalArgumentException("Customer ID must be greater than zero");
        }

        return dataLayer.findById(customerId);
    }
}
