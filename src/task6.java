import java.util.ArrayList;
import java.util.Arrays;

public class task6 {
    public static void main(String[] args) {

        ArrayList<String> flowers  = new ArrayList<>(Arrays.asList("Rose","Lily","Rose","Peony","Sunflower"));

        int first = flowers.indexOf("Rose");
        int last = flowers.lastIndexOf("Rose");
        System.out.println("First index of Rose: " + first );
        System.out.println("Last index of Rose: " + last );
    }
}