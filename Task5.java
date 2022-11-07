import java.util.ArrayList;

public class Task5 {
    int number;
    String name;
    boolean active;

    // Konstruktors, nebija prasīts bet izveidoju, lai testētu klasi
    Task5(int number, String name, boolean active) {
        this.number = number;
        this.name = name;
        this.active = active;
    }

    // Tiek pārveidota toString metode
    public String toString() {
        return "[ Nosaukums - " + this.name + " ID - " + this.number + " Aktivs - " + this.active + " ]";
    }

    // Metode kas atgriež padotā objekta skaitu sarakstā
    public int objectsInList(ArrayList<Task5> list, Task5 object) {
        int count = 0;
        // Iterējam cauri padotajam sarakstam
        for (int i = 0; i < list.size(); i++) {
            // Ja padotais objets sakrīt ar esošo sarakstā, pie counter pieskaitām 1
            if (list.get(i) == object) {
                count += 1;
            }
        }
        // Atgriežam skaitu
        return count;
    }

    public static void main(String args[]) {
        Task5 item = new Task5(1, "Nvidia", true);
        Task5 item2 = new Task5(2, "AMD", true);
        Task5 item3 = new Task5(3, "Intel", false);

        // Inicializējam dinamisko masīvu, lai glabātu objektus
        ArrayList<Task5> list = new ArrayList<Task5>();

        // Pievienojam objektus sarakstam
        list.add(item);
        list.add(item2);
        list.add(item);
        list.add(item3);
        list.add(item2);
        list.add(item3);

        System.out.println(item3.toString()+" Objektu skaits saraksta - "+item.objectsInList(list, item3));
        System.out.println(item.toString()+" Objektu skaits saraksta - "+item.objectsInList(list, item));
    }
}
