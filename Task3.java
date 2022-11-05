import java.io.File;
import java.io.FileNotFoundException;
// Importing all utility classes
import java.util.*;

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

    // fileFolder metode kas noskaidro cik norādītajā mapē ir faili un cik
    // apakšmapes.
    public String fileFolder(String path) {
        File fileFolder = new File(path);
        // Iegūstam visus failu un apakšmapju nosaukumus dotajā mapē un ierakstam masīva
        File[] files = fileFolder.listFiles();
        int failuSkaits = 0;
        int mapjuSkaits = 0;
        // iterējam cauri masīvam un ar isFile() un isDirectory() metodēm saskaitam cik
        // if
        // apakšmapas un cik ir faili
        for (int i = 0; i < files.length; i++) {
            // nosaka vai ir fails
            if (files[i].isFile()) {
                failuSkaits++;
            }
            // Nosauka vai ir mape
            if (files[i].isDirectory()) {
                mapjuSkaits++;
            }
        }
        // Atgriež String ar failu un mapju skaitu.
        return "Failu skaits mape - " + failuSkaits + " Apaksmapju skaits mape - " + mapjuSkaits;
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

    // sumFIle() metode, lai saskaitītu numbers.txt faila skaitļu summu.
    public void sumFile() {
        int totalSum = 0;
        // Inicializējam File objektu, lai norādītu ceļu uz failu
        File numberFile = new File(".\\codes\\numbers.txt");
        try {
            // Inicializējam Scanner objektu, lai lasītu failu
            Scanner sc = new Scanner(numberFile);
            // Inicializējam count mainīgo, lai saskaitītu rindas
            int count = 0;
            // Iterē cauri faila rindām
            while (sc.hasNextLine()) {
                // Count saskaita cik rindas failā.
                count++;
                // Atdala katru ciparu rinda pēc tukšuma simboliem
                String lines[] = sc.nextLine().split("\\s+");
                int lineSum = 0;
                // for cikls kas iterē cauri katras rindas elementiem un saskaita tos
                for (String part : lines) {
                    lineSum = lineSum + Integer.parseInt(part);
                }
                System.out.println(count + " rindas summa ir " + lineSum);
                // Katras rindas summa tiek pieskaitīta kopējai summai.
                totalSum = totalSum + lineSum;
            }
            // Aizver failu
            sc.close();

            // Kļūdas gadījuma, parāda kļūdu
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("Visu skaitlu summa faila - " + totalSum);
    }

    public void uniqName() {
        // Inicializējam File objektu, lai norādītu ceļu uz failu
        File namesList = new File(".\\codes\\names.list");

        // Inicializējam Set<String> sarakstu
        Set<String> nameString = new HashSet<String>();
        try {
            // Inicializējam Scanner objektu, lai lasītu failu
            Scanner sc = new Scanner(namesList);

            // Iterē cauri faila rindām
            while (sc.hasNextLine()) {
                // Sarakstam tiek pievienoti vārdi no names.list faila
                nameString.add(sc.nextLine());
            }
            // Aizver failu
            sc.close();

            // Kļūdas gadījuma, parāda kļūdu
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        // Tiek izprintēti visi unikālie vārdi sarakstā 
        System.out.println(nameString);
        // Tiek izprintēts unikālo vārdu skaits
        System.out.println("Unikalo vardu skaits - "+nameString.size());
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

        // Izprintē failu un mapju skaitu norādītajā mapē [ 2.UZD ]
        System.out.println(foo.fileFolder(".\\codes\\"));

        // Izprintē katras rindas skaitļu summu un kopējo skaitļu summu
        foo.sumFile();

        foo.uniqName();

    }
}
