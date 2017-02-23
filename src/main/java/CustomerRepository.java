import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulienl on 23/02/2017.
 */
public class CustomerRepository {
    private List<Customer> customers;

    public CustomerRepository(){
        customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Object getCustomers() {
        return customers;
    }

    public Customer findCustomerByLoyaltyCardBarcode(String barcode){
        for (Customer customer : customers){
            if (customer.getLoyaltyCardBarcode().equals(barcode)){
                return customer;
            }
        }
        return null;
    }
}
