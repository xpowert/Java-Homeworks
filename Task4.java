
// Importing all utility classes
import java.util.*;

public class Task4 {
    String name;
    int regNumber;

    // Inicializējam skaitļu sarakstu
    ArrayList<Integer> revenues = new ArrayList<Integer>();
    // Inicializējam unikāla teksta sarakstā
    Set<String> uniqServices = new HashSet<String>();

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

    // Metode kas pievieno izmantoto servisu sarakstam
    void addUsedService(String service) {
        // Izveidojam masīvu ar servisiem
        String[] services = { "hosting", "photoshop", "web administration", "spotify", "mailchimp" };

        // Pārbauda vai ievadītais serviss atbilst sarakstā izmantotajiem servisiem
        // Ievadīto servisu automātiski pārvēršam uz lowerCase, lai ievadot atbilstošu
        // servisu ar lielo burtu, tas tiktu atrasts sarakstā
        if (Arrays.asList(services).contains(service.toLowerCase())) {
            // Ievietojam sarakstā servisu ar mazajiem burtiem, lai pēc tam būtu vieglāk
            // atrast nepieciešamo servisu
            this.uniqServices.add(service.toLowerCase());
        } else
            System.out.println("Sads " + service + " serviss netiek izmantots!");
    }

    // Metode kas atgriež Revenues saraksta summu
    int sumRevenue() {
        // Pārbaudam vai saraksts nav tukšs
        if (this.revenues.isEmpty()) {
            return 0;
        }
        int sum = 0;
        // Iterējam cauri sarakstam un saskaitām kopā visus elementus
        for (int i = 0; i < this.revenues.size(); i++) {
            sum += this.revenues.get(i);
        }
        // Tiek atgriezta kopējo skaitļu summa
        return sum;
    }

    // Metode kas atgriež true, ja ievadītais vārds ir sarakstā
    boolean checkService(String servicName) {
        // pārbayda vai sarakstā ir norādītais string, kas ir konvertēs uz mazajiem
        // burtiem.
        if (this.uniqServices.contains(servicName.toLowerCase())) {
            return true;
        } else
            return false;
    }

    public static void main(String args[]) {
        // Izveidojam jaunu objektu
        Task4 system = new Task4();
        Task4 system2 = new Task4();
        Task4 system3 = new Task4();

        system.addRevenue(-55);
        system.addRevenue(400);
        system.addRevenue(100);
        system.addRevenue(256);

        system.addUsedService("Hosting");
        system.addUsedService("Spotify");

        system2.addRevenue(500);
        system2.addRevenue(341);

        system3.addUsedService("GIT Pro");
        system3.addUsedService("Mailchimp");
        system3.addUsedService("Spotify");
        System.out.println(system3.checkService("GIT Pro"));

        System.out.println(system.sumRevenue());
        System.out.println(system2.sumRevenue());
        System.out.println(system.checkService("SpotiFy"));

    }
}
