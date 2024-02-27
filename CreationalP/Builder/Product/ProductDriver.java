package CreationalP.Builder.Product;

public class ProductDriver {

    static ProductBuilder product = new ProductBuilder.Builder("Laptop", 101)
                        .weight(1500)
                        .description("A high-performance laptop")
                        .build();
    static void main(String[] args) {
        System.out.println(product);
    }
}