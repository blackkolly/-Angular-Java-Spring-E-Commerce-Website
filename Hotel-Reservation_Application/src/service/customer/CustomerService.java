package service.customer;

import model.customer.Customer;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class CustomerService {
    private static final CustomerService SINGLETON = new CustomerService();

    private final Map<String, Customer> customers = new HashMap<>();

    private CustomerService() {}

    public static CustomerService getSingleton() {
        return SINGLETON;
    }

    public void addCustomer(String email, String firstName, String lastName) {
        customers.put(email, new Customer(firstName, lastName, email));
    }

    public Customer getCustomer( String customerEmail) {
        return customers.get(customerEmail);
    }

    public Collection<Customer> getAllCustomers() {
        return customers.values();
    }
}

