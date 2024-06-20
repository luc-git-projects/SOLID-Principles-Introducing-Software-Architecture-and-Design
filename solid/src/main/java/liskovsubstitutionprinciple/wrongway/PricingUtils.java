package liskovsubstitutionprinciple.wrongway;

import java.util.ArrayList;
import java.util.List;

public class PricingUtils {

    public static void main(String[] args) {
        
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new InHouseProduct();
        
        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);
        
        products.stream().forEach(p ->{
            if(p instanceof InHouseProduct){
                ((InHouseProduct) p).applyDiscount();
            }
            
            System.out.println(p.getDiscount());
        });
    }

}