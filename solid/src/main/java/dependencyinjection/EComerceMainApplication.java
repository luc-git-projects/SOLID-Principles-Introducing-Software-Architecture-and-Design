package dependencyinjection;

public class EComerceMainApplication {

    public static void main(String[] args) {

        ProductRepository miscellany = ProductFactory.create();
        ProductCatalog productCatalog = new ProductCatalog(miscellany);
        productCatalog.listAllProducts();
    }
}
