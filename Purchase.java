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
    double totalSum(){
        double sum = 0;
        for(int i = 0; i < this.itemList.size(); i++){
            sum += this.itemList.get(i).product.pricePerItem * this.itemList.get(i).count;
        }
        return sum;
        //System.out.println(this.clientName +" bought "+this.itemList.size()+ " products");
    }

    void receipe(){
        System.out.println(this.clientName +" bought "+this.itemList.size()+ " products for total of "+totalSum()+"€");
        for(int i = 0; i < this.itemList.size(); i++){
            System.out.println("  - "+this.itemList.get(i).count+" "+this.itemList.get(i).product.name+" for "+this.itemList.get(i).product.pricePerItem * this.itemList.get(i).count+"€");
        }
    }

    public static void main(String args[]) {
        
        // Izveidojam Product objektus
        Product banans = new Product("Bannana", 0.20, "Fruits");
        Product limonade = new Product("Coca-cola", 0.79, "Drinks");
        Product sokolade = new Product("Snicker", 1.56, "Sweets");
        Product kafija = new Product("Nescafe", 5.99, "Coffe");
        Product siers = new Product("Cheese", 3.99, "Milk products");

        // Izveidojam Purchase objektus
        Purchase client1 = new Purchase("Client 1");
        Purchase client2 = new Purchase("Client 2");
        client1.addItem(banans, 5);
        client1.addItem(limonade, 2);

        client2.addItem(siers, 1);
        client2.addItem(kafija, 1);
        client2.addItem(sokolade, 3);

        client2.receipe();
    }
}
