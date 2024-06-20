package dependencyinjection;

import java.util.List;



public class ProductCatalog {
    
    private final ProductRepository productRepository;

    public ProductCatalog(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
    
    public void listAllProducts(){
        
        
        List<String> productNames = productRepository.getAllProducts();
        
        productNames.stream()
                .forEach(System.out::println);
    }
}