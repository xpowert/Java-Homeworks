public class PurchaseItem {
    Product product;
    int count;

    // Konstruktors

    PurchaseItem(Product product, int count) {
        this.product = product;
        this.count = count;
    }

    // Metodes

    // Metode kas pievieno s burtu ja ir vairāki produkti
    String correctName() {
        String product_name;
        if (this.count > 1) {
            product_name = this.product.name + "s";
            return product_name;
        } else
            return this.product.name;
    }
}
