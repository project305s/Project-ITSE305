import java.util.concurrent.ConcurrentHashMap;
import java.util.Map;

/**
 * The DataLayer class acts as a data layer for storing and retrieving
 * customer information. It uses an in-memory ConcurrentHashMap to simulate a database.
 */
public class DataLayer {
    private final Map<Integer, Customer> customerDatabase; // Thread-safe map
    private int currentId;

    /**
     * Constructor initializes the in-memory customer database and sets the starting ID.
     */
    public DataLayer() {
        this.customerDatabase = new ConcurrentHashMap<>(); // Changed to ConcurrentHashMap for thread safety
        this.currentId = 1; // Start IDs from 1
    }

    /**
     * Saves a customer to the repository.
     *
     * @param customer the Customer object to save
     * @throws IllegalArgumentException if the customer object is null
     */
    public synchronized void save(Customer customer) { // Added synchronization for thread-safe ID management
        if (customer == null) {
            throw new IllegalArgumentException("Customer cannot be null");
        }
        customer.setId(currentId++);
        customerDatabase.put(customer.getId(), customer);
    }

    /**
     * Finds a customer by their ID.
     *
     * @param id the ID of the customer to retrieve
     * @return the Customer object if found, otherwise null
     * @throws IllegalArgumentException if the ID is less than or equal to zero
     */
    public Customer findById(int id) {
        if (id <= 0) {
            throw new IllegalArgumentException("Customer ID must be greater than zero");
        }
        return customerDatabase.get(id);
    }
}
