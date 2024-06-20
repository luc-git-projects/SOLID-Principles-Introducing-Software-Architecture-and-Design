package singlereponsibilityprinciple.rightway;

public class TaxCalculator {
    
    public double calculateTax(Employee employee){
        
        if(employee.getType().equals("fulltime")){
            return 15.0;
        }
        
        if(employee.getType().equals("contract")){
            return 18.5;
        }
        return 0.0;
    }
}