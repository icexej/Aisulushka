import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task17 {
    public static void main(String[] args) {

        ArrayList<String> students = new ArrayList<>(Arrays.asList("Aisulu", "Sanjhar", null, "Amir", "Ulana", null, null));
        System.out.println("Original: " + students);
        students.removeAll(Collections.singleton(null));
        System.out.println("After removing " + students);
    }
}