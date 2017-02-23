import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by paulienl on 23/02/2017.
 */
public class CustomerRepositoryTest {
    CustomerRepository store = new CustomerRepository();

    @Test
    public void addCustomerToCollection(){
        Customer customer = new Customer("Piet","Uitdebroek");
        store.addCustomer(customer);
        List<Customer> customers = new ArrayList<Customer>();
        customers.add(customer);
        Assertions.assertEquals(store.getCustomers(), customers);
    }
    @Test
    public void findCustomerOnLoyaltyBarcode_ShouldReturnCustomer(){
        LoyaltyCard loyaltyCard = new LoyaltyCard("123",123);
        Customer customer = new Customer("Piet","Uitdebroek", loyaltyCard);

        org.assertj.core.api.Assertions.assertThat(store.findCustomerByLoyaltyCardBarcode("123").equals(customer));

    }
}