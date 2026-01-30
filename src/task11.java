import java.util.ArrayList;
import java.util.Arrays;

public class task11 {
    public static void main(String[] args) {

        ArrayList<String> countries1  = new ArrayList<>(Arrays.asList("Russia","German","France","Japan","China"));
        ArrayList<String> countries2  = new ArrayList<>(Arrays.asList("Canada","France","Japan"));

        ArrayList<String> commonElements = new ArrayList<>(countries1);
        commonElements.retainAll(countries2);
        System.out.println("Commmon countries: " + commonElements);
    }
}