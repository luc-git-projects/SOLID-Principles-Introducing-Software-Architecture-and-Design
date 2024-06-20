package openclosedprinciple.wrongway;

import java.util.Random;

public class VehicleInsuranceCustomerProfile {

    public boolean isLoyal(){
        return new Random().nextBoolean();
    }
}