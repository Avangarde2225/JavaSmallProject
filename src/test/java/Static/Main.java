package Static;

public class Main {
    public static void main(String[] args) {
        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.name = "Mouse";
        product.price = 100.0d;
        product.id = 125;
        productManager.add(product);
    }
}
