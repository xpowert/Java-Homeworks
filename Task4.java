
// Importing all utility classes
import java.util.*;

public class Task4 {
    String name;
    int regNumber;

    // Inicializējam skaitļu sarakstu
    ArrayList<Integer> revenues = new ArrayList<Integer>();
    // Inicializējam teksta sarakstu
    ArrayList<String> usedServices = new ArrayList<String>();
    // Pārvērš teksta sarakstu unikāla teksta sarakstā
    Set<String> uniqServices = new HashSet<String>(usedServices);

    // Metodes

    void addRevenue(int revenue) {
        // Ja skaitlis mazāks par 0, parādam attiecīgo paziņojumu
        if (revenue < 0) {
            System.out.println("Ienemumi nevar but negativi!");
            // Beidzam lasīt metodi
            return;
        }
        // Pievienojam skaitli revenues sarakstam
        this.revenues.add(revenue);
    }

    void addUsedService(String service){
        
    }
    public static void main(String args[]) {
        // Izveidojam jaunu objektu
        Task4 system = new Task4();

        system.addRevenue(-55);

    }
}
