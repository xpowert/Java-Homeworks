import java.util.ArrayList;

public class Car {
    String model;
    int year;
    ArrayList<String>extras;

    // Konstruktors
    Car(String model, int year, ArrayList<String> extras){
        this.model = model;
        this.year = year;
        this.extras = extras;
    }
    public static void main(String args[]) {
        ArrayList<String> carExtras = new ArrayList<String>();
        carExtras.add("Prieksejie parkosanas sensori");
        carExtras.add("Start/Stop sistema");
        ArrayList<String> carExtras2 = new ArrayList<String>();
        carExtras2.add("Navigacija");
        carExtras2.add("Apsildamie sedekli");
        ArrayList<String> carExtras3 = new ArrayList<String>();
        carExtras3.add("Aizmugurejie parkosanas sensori");
        carExtras3.add("Luka");

        Car car = new Car("Audi A6", 2015, carExtras);
        Car car2 = new Car("BMW x5", 2012, carExtras2);
        Car car3 = new Car("Volvo XC60", 2015, carExtras3);
    }
}
