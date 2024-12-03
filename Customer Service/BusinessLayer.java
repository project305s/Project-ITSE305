/*
 * The BusinessLayer class provides business logic for customer-related operations
 * in the online library system. It interacts with the data layer to perform actions
 */
public class BusinessLayer {
    private DataLayer DataLayer;

    public BusinessLayer(DataLayer DataLayer) {
        this.DataLayer = DataLayer;
    }

    /**
     * Registers a new customer and saves it to the repository
     */
    public Customer registerCustomer(String name, String email) {
        Customer customer = new Customer(name, email);
        DataLayer.save(customer);
        return customer; //this return The registered Customer object
    }

    /**
     * Retrieves customer details based on the customer ID.

     * The ID of the customer to retrieve
     */
    public Customer getCustomerDetails(int customerId) {
        return DataLayer.findById(customerId); //this return The Customer object if found, otherwise null
    }
}
