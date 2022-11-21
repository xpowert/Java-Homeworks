import java.util.ArrayList;

public class Purchase {
    String clientName;
    ArrayList<PurchaseItem> itemList = new ArrayList<PurchaseItem>();

    // Konstruktors
    Purchase(String clientName) {
        this.clientName = clientName;
    }

    // addItem metode, izveidot jaunu PurchaseItem objektu, pievieno PurchaseItem
    // objektu itemList sarakstam
    void addItem(Product product, int count) {

        // Tiek izveidots jauns PurchaseItem objekts
        PurchaseItem item = new PurchaseItem(product, count);

        // Pievienojam objektu Itemlist Srakastam.
        this.itemList.add(item);

    }

    // Metode kas aprēķina kopējo summu
    double totalSum() {
        double sum = 0;
        for (int i = 0; i < this.itemList.size(); i++) {
            sum += this.itemList.get(i).product.pricePerItem * this.itemList.get(i).count;
        }
        return sum;
    }

    void receipe() {
        System.out.println(
                this.clientName + " bought " + this.itemList.size() + " products for total of " + totalSum() + "€");
        for (int i = 0; i < this.itemList.size(); i++) {
            System.out.println("  - " + this.itemList.get(i).count + " " + this.itemList.get(i).correctName() + " for "
                    + this.itemList.get(i).product.pricePerItem * this.itemList.get(i).count + "€");
        }
    }

    // Metode kas izņem visus produktus no saraksta
    void clearPruchaseList() {
        this.itemList.clear();
    }

    // Metode kas izņem pēdējo produktu no saraksta
    void removeLastItem() {
        // Aprēķinam indeksu pēdējam saraksta elementam
        int index = this.itemList.size() - 1;
        this.itemList.remove(index);
    }

    // Metode kas izdzēš viss dargāko produktu no saraksta
    void removeMostExpensiveItem() {
        double counter = 0;
        double expensive = 0;
        int index = 0;
        // Iterējam cauri sarakstam, lai atrastu dārgāko objektu, noskaidrotu objekta
        // indeksu saraksta un pēc tam to idzēstu
        for (int i = 0; i < this.itemList.size(); i++) {
            // Katrā iterācijā produktu skaita summa tiek piešķirta counter elementam
            counter = this.itemList.get(i).product.pricePerItem * this.itemList.get(i).count;
            // tiek meklēts dārgākais produkts
            if (counter > expensive) {
                expensive = counter;
                // ar indexof atrodam dārgākā produkta indeksu sarakstā
                index = this.itemList.indexOf(this.itemList.get(i));
            }
        }
        // Dārgākais produkts tiek idzēsts no saraksta
        this.itemList.remove(index);
    }

    public static void main(String args[]) {

        // Izveidojam Product objektus
        Product bannana = new Product("Bannana", 0.20, "Fruits");
        Product limonade = new Product("Coca-cola", 0.79, "Drinks");
        Product chocolate = new Product("Snicker", 1.56, "Sweets");
        Product coffe = new Product("Nescafe", 5.99, "Coffe");
        Product cheese = new Product("Cheese", 3.99, "Milk products");

        // Izveidojam Purchase objektus
        Purchase client1 = new Purchase("Client 1");
        Purchase client2 = new Purchase("Client 2");
        client1.addItem(bannana, 5);
        client1.addItem(limonade, 2);

        client2.addItem(cheese, 1);
        client2.addItem(coffe, 1);
        client2.addItem(chocolate, 3);

        client2.receipe();

        client1.receipe();
        // Tiek pielietota metode kas izdzēš dārgāko produktu no saraksta
        client1.removeMostExpensiveItem();
        client1.receipe();

        // Tiek izņemts pēdējais elements no saraksta
        client2.removeLastItem();

        client2.receipe();
        // Tiek iztīrīts produktu saraksts
        client2.clearPruchaseList();
        // Tiek atgriezts tukšs produktu saraksts
        client2.receipe();
    }
}
