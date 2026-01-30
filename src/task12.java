import java.util.ArrayList;
import java.util.Arrays;

public class task12 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>(Arrays.asList("Aisulu", "Diana", "Erjan", "Danila", "Muslima"));
        names.removeIf(name -> name.length() % 2 == 0);
        System.out.println("After deleting: " + names);
    }
}