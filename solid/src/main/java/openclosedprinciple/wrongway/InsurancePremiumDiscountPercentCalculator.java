package openclosedprinciple.wrongway;

public class InsurancePremiumDiscountPercentCalculator {

    public double claculatePremiumDiscountPercent(HealthInsuranceCustomerProfile customer){
        
        if(customer.isLoyalCustomer()){
            return 19.4;
        }
        return 0.0;
    }
    
    public double claculatePremiumDiscountPercent(VehicleInsuranceCustomerProfile customer){
        
        if(customer.isLoyal()){
            return 19.4;
        }
        return 0.0;
    }
}