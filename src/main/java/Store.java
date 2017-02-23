import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulienl on 23/02/2017.
 */
public class Store {
    private List<Customer> customers;

    public Store(){
        customers=new ArrayList<>();
    }
    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    public Object getCustomers() {
        return customers;
    }
}