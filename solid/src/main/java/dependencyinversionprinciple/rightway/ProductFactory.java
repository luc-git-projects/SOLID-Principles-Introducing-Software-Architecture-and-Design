package dependencyinversionprinciple.rightway;

public class ProductFactory {
    
    public static ProductRepository create(){
        return new SQLProductRepository();
    }
}