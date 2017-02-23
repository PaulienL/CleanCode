/**
 * Created by paulienl on 23/02/2017.
 */
public class LoyaltyCard {

    private String loyaltyCardID;
    private String loyaltyCardBarcode;
    private long bonusPoints;

    public LoyaltyCard(String loyaltyCardID, String loyaltyCardBarcode, long bonusPoints) {
        this.loyaltyCardID = loyaltyCardID;
        this.loyaltyCardBarcode = loyaltyCardBarcode;
        this.bonusPoints = bonusPoints;
    }

    public String getLoyaltyCardBarcode() {
        return loyaltyCardBarcode;
    }

    public long getBonusPoints() {
        return bonusPoints;
    }

    public String getLoyaltyCardID() {
        return loyaltyCardID;
    }
}

