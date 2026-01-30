import java.util.ArrayList;
import java.util.Arrays;

public class task09 {
    public static void main(String[] args) {

        ArrayList<String> cities  = new ArrayList<>(Arrays.asList("Bishkek","Moscow","Paris","Pecin","Tokyo"));
        String[] cityArray = cities.toArray(new String[0]);


        System.out.println(cityArray[0] );

    }
}