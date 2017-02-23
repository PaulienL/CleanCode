import org.junit.Before;
import org.junit.Test;
import static org.mockito.Mockito.*;
/**
 * Created by paulienl on 23/02/2017.
 */
public class CustomerTest {

    private Customer customer;
    private LoyaltyCard loyaltyCard;

    @Before
    public void setUp(){
        customer=mock(Customer.class);
        loyaltyCard=mock(LoyaltyCard.class);
    }
    @Test
    public void addLoyaltyCard(){

        verify(customer).addLoyaltyCard(loyaltyCard);
    }
}