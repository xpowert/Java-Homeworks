import java.io.File;

class Task3 {

    public static void main(String args[]) {

        // Inicializējam String un int mainīgos
        String name = "Marcis";

        // Ar length metodi iegūstam String garumu
        int varda_garums = name.length();

        // Izvada vārda garumu
        System.out.println(varda_garums);

        // Inicializējam jaunu File objektu un norādām attiecīgo failu, ņemot vērā vārda garumu
        File myFile = new File("..\\codes\\file" + varda_garums + ".txt");

        // Izmantojot getName() metodi izprintējam faila nosaukumu. 
        System.out.println(myFile.getName());

    }
}
