
//Bibliotēkas priekš Hashmap
import java.util.HashMap;
//import java.util.Map;

public class Task2 {
    String product_name;
    String product_class;
    int price;
    int id;

    // Konstruktors
    Task2(String product_name, String product_class, int price, int id) {
        this.product_name = product_name;
        this.product_class = product_class;
        this.price = price;
        this.id = id;
    }

    // Main metode
    public static void main(String args[]) {

        // Inicializējam 3 jaunus objektus
        Task2 foo = new Task2("Samsung S22", "Telefons", 1000, 1);
        Task2 foo2 = new Task2("Apple Iphone13 Pro", "Telefons", 1300, 2);
        Task2 foo3 = new Task2("Xiaomi 12", "Telefons", 980, 3);

        Task2 foo4 = new Task2("Samsung A20", "Telefons", 400, 4);
        Task2 foo5 = new Task2("Apple Ipad 9", "Plansete", 500, 5);

        // Inicializējam hashmap sarakstus
        HashMap<String, Task2> map = new HashMap<>();
        HashMap<String, Task2> map2 = new HashMap<>();

        // Ar put palīdzību ievietojam objektus hashmap
        map.put("Pirmais", foo);
        map.put("Otrais", foo2);
        map.put("Tresais", foo3);

        map2.put("Piektais", foo5);
        map2.put("Ceturtais", foo4);

        // Savienojam sarakstus ar putAll
        map.putAll(map2);

        // Izņemam objektu no saraksta izmantojot atslēgas vārdu
        map.remove("Ceturtais");

        // Izdrukāt saraksta izmēru
        System.out.println(map.size());

        // Ievietojam sarakstā objektu ar eksistējošu atsleģas vārdu un izdrukājam
        // izmēru
        map.put("Pirmais", foo5);
        System.out.println(map.size());

        // Pielietojam containsKey() un containsValue()
        System.out.println("Vai atslēga - Pirmais atrodas saraksta ? " +
                map.containsKey("Pirmais"));

        System.out.println("Vai atslēga - Astotais atrodas saraksta ? " +
                map.containsKey("Astotais"));

        System.out.println("Vai objekts - Foo4 atrodas saraksta ? " +
                map.containsValue(foo4));

        System.out.println("Vai objekts - Foo2 atrodas saraksta ? " +
                map.containsValue(foo2));

        // For cikls lai iteretu cauri sarakstam

        for (String key : map.keySet()) {
            System.out.println(key + ":" + map.get(key));
        }

        // Iegūstam objektu no saraksta izmantojot get()

        System.out.println(map2.get("Piektais"));

        // Iztīrīt sarakstus
        map.clear();
        map2.clear();

        // Izprinējam sarakstu
        System.out.println(map);
    }

}
