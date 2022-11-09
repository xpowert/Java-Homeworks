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

    public static void main(String args[]) {

    }
}
