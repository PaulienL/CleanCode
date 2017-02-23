/**
 * Created by paulienl on 23/02/2017.
 */
public class Customer {

    private LoyaltyCard loyaltyCard;

    private String customerID;
    private String firstName;
    private String lastName;

    public Customer(String customerID, String firstName, String lastName) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public Customer(String customerID, String firstName, String lastName, LoyaltyCard loyaltyCard) {
        this.customerID = customerID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.loyaltyCard = loyaltyCard;
    }

    public void addLoyaltyCard(LoyaltyCard loyaltyCard) {

    }

    public LoyaltyCard getLoyaltyCard() {
        return loyaltyCard;
    }
    public String getLoyaltyCardBarcode(){
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
}
