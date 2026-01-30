import java.util.ArrayList;

public class task04 {
    public static void main(String[] args) {

        ArrayList<String> fruits  = new ArrayList<>();
        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Pomelo");
        fruits.add("Banana");
        fruits.add("Pineapple");
        fruits.add("Kiwi");
        fruits.add("Mango");

        fruits.removeIf(f -> f.equals("Banana"));
        System.out.println("After deleting: " + fruits);
    }
}