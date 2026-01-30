import java.util.ArrayList;
import java.util.Arrays;

public class task14 {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("Come and go", "Iris", "Heartless", "Often", "Streets"));
        for (int i = 0; i < songs.size(); i++){
            String original = songs.get(i);
            String replaced = original.replaceAll("(?i)[aeiouy]", "*");
            songs.set(i, replaced);
            System.out.println("After replacing: " + songs);
        }
    }
}