package openclosedprinciple.wrongway;

import java.util.Random;

public class HealthInsuranceCustomerProfile {
    
    public boolean isLoyalCustomer(){
        return new Random().nextBoolean();
    }
}