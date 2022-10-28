package PackageName;

//Importējam nepieciešamās bibliotēkas, lai izmantotu List un ArrayList
import java.util.ArrayList;
import java.util.List;

public class Start {
    public static void main(String[] args) {
        // Izveidojam 4 Box klases objektus
        Box kaste1 = new Box("Kaste 1", 5, 3, 6);
        Box kaste2 = new Box("Kaste 2", 5, 5, 5);

        Box kaste3 = new Box("Kaste 3", 5);
        Box kaste4 = new Box("Kaste 4", 5);

        // Izmantojam iepriekš izveidotās metodes
        // Tiek izvadīts nosaukums
        System.out.println(kaste1.getName());
        // Tiek noteikts vai ir kubs
        System.out.println(kaste1.isCube());
        // Tiek piešķirts jauns nosaukums
        kaste1.setName("Kaste 1 jauna");
        System.out.println(kaste1.getName());

        // tiek izvadīta toString metode
        System.out.println(kaste1.toString());

        // Definētjam masīvu
        List<Box> masivs = new ArrayList<Box>();
        // Pievienojam objektus sarakstam
        masivs.add(kaste1);
        masivs.add(kaste2);
        masivs.add(kaste3);
        masivs.add(kaste4);
        // For cikls kas iterē cauri masīvam
        for (int i = 0; i < masivs.size(); i++) {
            System.out.println(masivs.get(i).getName() + " Tilpums - " + masivs.get(i).getVolume());
            // Ja objekts ir kubs tad tiek nomainīts nosaukums
            if (masivs.get(i).isCube()) {
                masivs.get(i).setName("Kuba kaste");
            }
            // izprintējas visi objekti
            System.out.println(masivs.get(i).toString());
        }

    }

}