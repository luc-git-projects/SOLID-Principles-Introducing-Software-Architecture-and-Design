package liskovsubstitutionprinciple.rightway;


public class InHouseProduct extends Product{

    @Override
    public double getDiscount() {
        this.applyDiscount();
        return discount;
    }
    
    private void applyDiscount(){
        this.discount *= 1.5;
    }
}