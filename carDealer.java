import java.util.ArrayList;
public class carDealer {
    String name;
    int regnumber;
    Car car;

    // Konstruktors
    carDealer(String name, int regnumber, Car car) {
        this.name = name;
        this.regnumber = regnumber;
        this.car = car;
    }

    public static void main(String args[]) {
        //ArrayLists kurā ietilpst katras mašīnas extrast
        ArrayList<String> extrasAudi = new ArrayList<String>();
        extrasAudi.add("Parkosanas sensori prieksejie");
        extrasAudi.add("Automatiska karba");
        ArrayList<String> extrasBmw = new ArrayList<String>();
        extrasBmw.add("Parkosanas sensori pakalejie");
        extrasBmw.add("Luka");
        ArrayList<String> extrasVolvo = new ArrayList<String>();
        extrasVolvo.add("Start/Stop sistema");
        extrasVolvo.add("Thor gaismas");
        // Inicializētie objekti no katras klases
        Car car = new Car("Audi A6", 2016, extrasAudi);
        Car car2 = new Car("BMW x6", 2011, extrasBmw);
        Car car3 = new Car("Volvo XC60", 2019, extrasVolvo);
        carDealer dealer = new carDealer("Musa motors", 1234, car3);
        carDealer dealer2 = new carDealer("Audi Latvia", 2233, car);
        carDealer dealer3 = new carDealer("BMW Latvia", 9876, car2);

        // Inicializēts saraksts kurā ievietot 2. klases objektus
        ArrayList<carDealer> dealers = new ArrayList<carDealer>();
        dealers.add(dealer3);
        dealers.add(dealer2);
        dealers.add(dealer);

        for(int i =0; i < dealers.size(); i++){
            System.out.println("Dilera nosaukums - "+dealers.get(i).name+" Registracijas numurs - "+dealers.get(i).regnumber);
            System.out.println("Dilera "+dealers.get(i).name+" piedavatais auto:");
            System.out.println("Auto nosaukums: "+dealers.get(i).car.model+" Izlaiduma gads: "+dealers.get(i).car.year);
            dealers.get(i).car.printExtras();
        }
    }
}
