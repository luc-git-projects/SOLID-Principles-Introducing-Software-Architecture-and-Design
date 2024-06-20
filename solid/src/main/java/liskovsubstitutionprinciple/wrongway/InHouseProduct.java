package liskovsubstitutionprinciple.wrongway;

public class InHouseProduct extends Product{
    
    public void applyDiscount(){
        this.discount *= 1.5;
    }
}