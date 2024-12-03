import java.util.HashMap;
import java.util.Map;

/**
 * The DataLayer class acts as a data layer for storing and retrieving
 * customer information. It uses an in-memory HashMap to simulate a database.
 */
public class DataLayer {
    private Map<Integer, Customer> customerDatabase;
    private int currentId;

    public DataLayer() {
        this.customerDatabase = new HashMap<>();
        this.currentId = 1; // Start IDs from 1
    }

    /**
     * Saves a customer to the repository.
     */
    public void save(Customer customer) {
        customer.setId(currentId++);
        customerDatabase.put(customer.getId(), customer);
    }

    /**
     * Finds a customer by their ID. 
     */
    public Customer findById(int id) {
        return customerDatabase.get(id); //return The Customer object if found, otherwise null
    }
}
