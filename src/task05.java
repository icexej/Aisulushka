import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class task05 {
    public static void main(String[] args) {

        ArrayList<String> colors  = new ArrayList<>(Arrays.asList("Red","Green","Blue","White","Pink"));
        Collections.fill(colors,"Black");

        System.out.println(colors);
    }
}