import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * Created by paulienl on 23/02/2017.
 */
public class Customer {

    private LoyaltyCard loyaltyCard;

    private String customerID;
    private String firstName;
    private String lastName;
    private List<Grocery> groceryList;

    public Customer( String firstName, String lastName) {
        this.groceryList = new ArrayList<>();
        this.customerID = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String firstName, String lastName, LoyaltyCard loyaltyCard) {

        this.groceryList = new ArrayList<>();
        this.customerID = UUID.randomUUID().toString();
        this.firstName = firstName;
        this.lastName = lastName;
        this.loyaltyCard = loyaltyCard;
    }

    public void addLoyaltyCard(LoyaltyCard loyaltyCard) {

        if(this.loyaltyCard == null){
            this.loyaltyCard = loyaltyCard;
        }
    }

    public LoyaltyCard getLoyaltyCard()
    {
        return loyaltyCard;
    }
    public String getCustomerLoyaltyCardBarcode(){

        return loyaltyCard.getLoyaltyCardBarcode();
    }

    public String getCustomerID() {
        return customerID;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void addGrocery(String groceryName){
        groceryList.add(new Grocery(groceryName));
    }

    public int timesBought(String groceryToFind)
    {
        int result = 0;
        for (Grocery item: groceryList)
        {
            if (item.getName().equals(groceryToFind))
            {
                ++result;
            }
        }
        return result;
    }

}
