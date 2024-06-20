package dependencyinversionprinciple.rightway;


public class ProductCatalog {
    
    public void listAllProducts(){
        
        ProductRepository productRepository = ProductFactory.create();
        productRepository.getAllProducts();
        // List aall products here
    }
}