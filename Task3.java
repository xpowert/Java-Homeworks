import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

class Task3 {

    String name;

    // setName metode kas piešķir vērtību parametram name
    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return this.name;
    }

    // Metode kas atgriež vārda garumu
    int nameLenght() {
        return this.name.length();
    }

    // myFile metode kas atgriež File objektu, ņemot vērā burtu skaitu definētajā
    // vārda un ceļu uz failu
    public File myFile() {
        // tiek norādīts ceļš uz failu ņemot vērā name burtu skaitu.
        File myFile = new File(".\\codes\\file" + this.nameLenght() + ".txt");
        return myFile;
    }

    public int countLines() {
        int lines = 0;
        try {
            Scanner sc = new Scanner(this.myFile());
            // Iterē cauri faila rindām
            while (sc.hasNextLine()) {
                lines++;
                sc.nextLine();
            }
            // Aizver failu
            sc.close();
            // Atgriež rindu skaitu
            return lines;
            // Kļūdas gadījuma, parāda kļūdu
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return lines;
        }
    }

    // Atgriež faila nosaukumu bez paplašinājuma
    public String fileName(String name) {
        // Izveidojam jaunu masīvu kurā glabāsies faila nosaukums un paplašinājums
        // Ar split atdala string vadoties pēc punkta stringā
        String[] fileName = name.split("\\.");

        // Atgriež pirmo elementu no masīva
        return fileName[0];
    }

    public static void main(String args[]) {

        // Inicializējam objektu Task3
        Task3 foo = new Task3();

        // Uzstādām vārdu
        foo.setName("Marcis");

        // Izprintējam vārdu un vārda garumu
        System.out.println("Vards " + foo.getName() + " Varda garums - " + foo.nameLenght());

        // Izprintē atrasto failu
        System.out.println(foo.myFile().getName());

        // Izprintē faila nosaukumu bez paplašinājuma
        System.out.println(foo.fileName(foo.myFile().getName()));

        // Izprintē rindu skaitu failā
        System.out.println(foo.countLines());

    }
}
