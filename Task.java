import java.util.ArrayList;

public class Task {

    // Klases Task mainīgie
    String name;
    String surname;
    int age;
    int id;

    // Konstruktors
    Task(String name, String surname, int age, int id) {
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.id = id;
    }

    // Metode kas atgriež vārda garumu
    int idFormat(String name) {
        return name.length();
    }

    // Metode kas iterē cauri sarakstam un izvada objektus
    public static void printList(ArrayList<Task> str) {
        // For cikls lai iterētu cauri parametros padotajam sarakstam
        // Katram saraksta objektam tiek izsaukta iepriekš izveidotā idFormat metode
        for (int i = 0; i < str.size(); i++) {
            System.out.println("Objekta nosaukums - [ " + str.get(i).name + " ] simbolu skaits nosaukuma - "
                    + str.get(i).idFormat(str.get(i).name));
        }
    }

    // Metode kas atgriež negatīvu int, ja objekta vārds ir Janis
    int wrongName(String name) {
        int n = 1;
        if (name == "Janis") {
            n = -1;
            return n;
        } else
            return n;
    }

    // Metode kas, kā parametru paņem sarakstu, iterē cauri tam, ja wrongName metode
    // atgriež negatīvu skaitli tad tiek izņemts attiecīgais objekts no saraksta
    public static void rmObject(ArrayList<Task> str) {
        for (int i = 0; i < str.size(); i++) {
            // ja wrongName metode atgriež skaitli kas mazāks par 1, tad tas objekts tiek
            // izdzēsts no saraksta.
            if (str.get(i).wrongName(str.get(i).name) < 0) {
                str.remove(i);
            } else {
                System.out.println("- " + str.get(i).name);
            }
            // Izvada atlikušo objektu vārdus

        }
    }

    // Metode kas nosaka, vai persona ir pilngadīga
    boolean isAdult(int age) {
        if (age < 18) {
            return false;
        } else
            return true;
    }




    // Tiek pārveidota toString metode
    public String toString() {
        return "[ Nosaukums - " + this.name + " Vecums - " + this.age + " ID - " + this.id + " ]";
    }

    // Main klase
    public static void main(String args[]) {

        // Tiek izveidoti klases Task objekti
        Task uzd = new Task("Janis", "Abele", 18, 1485);
        Task uzd2 = new Task("Agris", "Berzins", 22, 1122);
        Task uzd3 = new Task("Dana", "Balta", 17, 1234);
        Task uzd4 = new Task("Anna", "Ozola", 15, 5982);
        Task uzd5 = new Task("Juris", "Kalns", 21, 8934);

        // Izveidojam jaunu sarakstu

        ArrayList<Task> str = new ArrayList<Task>();
        ArrayList<Task> str2 = new ArrayList<Task>();

        // Pievienojam objektus sarakstam
        str.add(uzd);
        str.add(uzd2);
        str.add(uzd3);
        str.add(uzd4);
        str.add(uzd5);

        str2.add(uzd5);
        str2.add(uzd2);
        str2.add(uzd3);

        // Pievienojam pirmajam sarakstam, otrā saraksta objektus

        str.addAll(str2);
        // Tiek izprintēts saraksta izmērs
        System.out.println(str.size());
        System.out.println(str2.size());

        str2.clear();
        System.out.println(str2.size());
        System.out.println(uzd.idFormat(uzd.name));

        // Tiek izvadīti klases objekti izsaucot statisko metodi
        Task.printList(str);

        // Izprine sarakstu kur nodzēsts objekts ar vārdu Janis
        Task.rmObject(str);

        // Itere cauri sarakstam un izprintē objektus kuri ir pilngadīgi un ID summu
        int sum = 0;
        for(int i = 0; i < str.size(); i++){
            if(str.get(i).isAdult(str.get(i).age) == true){
                sum = sum + str.get(i).id;
                System.out.println("Vards - "+str.get(i).name+" vecums - "+str.get(i).age);
            }
        }
        // Tiek izvadīta ID summa
        System.out.println("ID summa - "+sum);
        // Tiek parbaudits vai saraksts ir tukss. 
        if(str2.isEmpty()){
            System.out.println("Saraksts ir tukss");
        }
        // Sarakstam tiek piešķirta vienāda kapacitāte ar objektu skaitu
        str.trimToSize();
        System.out.println(str.size());
        // Tiek izprintēti objekti no indeksa 1 līdz indeksam 3
        System.out.println(str.subList(1, 3));
    }
}
