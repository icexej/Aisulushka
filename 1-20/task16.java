import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task16 {
    public static void main(String[] args) {

        ArrayList<String> days = new ArrayList<>(Arrays.asList("Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"));
        System.out.println("Original: " + days);
        Collections.rotate(days, 2);
        System.out.println("Rotated by 2: " + days);
    }
}