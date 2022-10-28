package PackageName;

public class Box {

    // Klases Box parametri
    private String name;
    int height;
    int width;
    int depth;

    // Klases konstruktors
    Box(String name, int height, int width, int depth) {
        this.name = name;
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    // Klases Box otrs konstruktors
    Box(String name, int sides) {
        this.name = name;
        this.height = sides;
        this.width = sides;
        this.depth = sides;
    }
    // Klases Box metodes

    // getVolume() metode atgriež malu reizinājumu.
    int getVolume() {
        int volume = this.height * this.width * this.depth;
        return volume;
    }

    // isCube() metode kas atgriež true ja malas vienādas
    // tiek definēta kā boolean, jo atgriež true, vai false
    boolean isCube() {
        // ja visas malas vienādas atgriež true
        if (this.height == this.width && this.height == this.depth && this.depth == this.width) {
            return true;
        }
        // ja kāda no malām nav vienāda atgriež false
        else
            return false;
    }

    // getName metode kas atgriež parametru name
    String getName() {
        return this.name;
    }

    // setName metode kas piešķir vērtību parametram name
    void setName(String name) {
        this.name = name;
    }

    // Tiek pārveidota toString metode
    public String toString() {
        return "Box klases nosaukums - [ " + this.name + " ] Augstums - " + this.height + " Platums - " + this.width
                + " Dzilums - " + this.depth;
    }
}
