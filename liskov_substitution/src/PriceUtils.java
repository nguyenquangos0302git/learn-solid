import java.util.ArrayList;
import java.util.List;

public class PriceUtils {

    public static void main(String[] args) {
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new InHouseProduct();

        List<Product> products = new ArrayList<>();
        products.add(p1);
        products.add(p2);
        products.add(p3);

        for (Product product : products) {
            double price = product.getDiscount();
        }

    }

}
