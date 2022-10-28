// 2.uzdevums definēta jauna klase Book
public class Book {

    // Klases parametri
    String name;
    private String author;
    int release_date;
    double price;

    // Konstruktors
    Book(String name, String author, int release_date, double price) {
        this.name = name;
        this.author = author;
        this.release_date = release_date;
        this.price = price;
    }

    // Klases metodes

    // Tiek piešķirts jauns autors
    void setAuthor(String author) {
        this.author = author;
    }

    // Tiek atgriezts autora vārds
    String getAuthor() {
        return this.author;
    }

    // Piešķir jaunu cenas vērtību
    void setPrice(double price) {
        this.price = price;
    }

    // Static metode kas izvada veikala nosaukumu

    public static void storeName() {
        System.out.println("Zvaigzne ABC");
    }

    public static void main(String[] args) {
        // Izveidojas objektu book1 un norādām parametru vērtības
        Book book1 = new Book("Ābece", "Jānis Bērziņš", 2021, 10.99);
        // Izprintējam autora vārdu
        System.out.println(book1.getAuthor());
        // Nomainām autora vārdu
        book1.setAuthor("Artūrs Ozoliņš");
        // Tiek izprintēts jaunais autora vārds
        System.out.println(book1.getAuthor());
        // Izprintējam grāmatas cenu
        System.out.println(book1.price);
        // Nomainām grāmatas cenu
        book1.setPrice(19.56);
        // Izprintējam grāmatas cenu
        System.out.println(book1.price);
        // Izmantojam static metodi
        Book.storeName();

    }
}
