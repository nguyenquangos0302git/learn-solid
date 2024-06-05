public class EcommereApp {

    public static void main(String[] args) {
        ProductRepository productRepository = ProductFactory.create();
        ProductCatalog productCatalog = new ProductCatalog(productRepository);
        productCatalog.listAllProduct();
    }

}
