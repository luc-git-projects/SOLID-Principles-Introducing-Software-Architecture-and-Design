package dependencyinversionprinciple.wrongWay;

public class ProductCatalog {
    
    public void listAllProducts(){
        
        SQLProductRepository sQLProductRepository = new SQLProductRepository();
        sQLProductRepository.getAllProducts();
        // List aall products here
    }
}