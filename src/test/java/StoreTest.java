import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulienl on 23/02/2017.
 */
class StoreTest {
    Store store = new Store();

    @Test
    public void addCustomerToCollection(){
        Customer customer = new Customer();
        store.addCustomer(customer);
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(customer);
        Assertions.assertEquals(store.getCustomers(), customers);
    }
}