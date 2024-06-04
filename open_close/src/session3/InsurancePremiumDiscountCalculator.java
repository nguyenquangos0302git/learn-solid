package session3;

public class InsurancePremiumDiscountCalculator {

    public int calculatePremiumDiscountPercent(CustomerProfile customerProfile) {
        if (customerProfile.isLoyal()) {
            return 20;
        }
        return 0;
    }

}
