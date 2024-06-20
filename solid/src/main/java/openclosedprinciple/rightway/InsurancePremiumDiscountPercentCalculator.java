package openclosedprinciple.rightway;


public class InsurancePremiumDiscountPercentCalculator {

    public double claculatePremiumDiscountPercent(CustomerProfile customer){
        
        if(customer.isLoyalCustomer()){
            return 19.4;
        }
        return 0.0;
    }

}