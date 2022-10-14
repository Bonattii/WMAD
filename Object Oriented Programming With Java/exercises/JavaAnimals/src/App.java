import Crocodile.Crocodile;
import Eagle.Eagle;
import Eel.Eel;

public class App {
    public static void main(String[] args) throws Exception {
        Crocodile crocodile = new Crocodile(true, "hard", "yes", "egg", 45, 34.4, "crocodile", "red");
        Eel eel = new Eel(true, true, true, 2, 5.5, "fish", "blue");
        Eagle eagle = new Eagle(true, true, 40, 40.4, "bird", "red");
        ;

        System.out.println(eagle.getAnimalType());
        System.out.println(eel.getAnimalType());
        System.out.println(crocodile.getAnimalType());
    }
}
