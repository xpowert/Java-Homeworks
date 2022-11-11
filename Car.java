import java.util.ArrayList;

public class Car {
    String model;
    int year;
    ArrayList<String> extras = new ArrayList<String>();

    // Konstruktors
    Car(String model, int year, ArrayList<String> extras) {
        this.model = model;
        this.year = year;
        this.extras = extras;
    }

    // Metodes

    void printExtras(){
        System.out.println("Auto ieklautas ektras");
        for(int i =0; i<this.extras.size(); i++){
            System.out.println(extras.get(i));
        }
    }
    public static void main(String args[]) {

    }
}