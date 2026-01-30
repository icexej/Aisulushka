import java.util.ArrayList;
import java.util.Arrays;

public class task19 {
    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Apple", "Banana", "Kiwi", "Orange", "Mango"));
        ArrayList<Integer> lengths = new ArrayList<>();
        for (String fruit : fruits) {
            lengths.add(fruit.length());
        }
        System.out.println("Fruits: " + fruits);
        System.out.println("Lengths: " + lengths);
    }
}
