import java.util.ArrayList;
import java.util.Arrays;

public class task18 {
    public static void main(String[] args) {

        ArrayList<String> movies = new ArrayList<>(Arrays.asList("Avatar", "Astral", "SpongeBob", "The Maze Runner", "Back to the future"));
        System.out.println("Original: " + movies);

        String longest = "";
        String secondLongest ="";

        for (String movie : movies) {
            int currentLength = movie.length();
            if (currentLength > secondLongest.length() &&! movie.equals(longest)){
                secondLongest = movie;
            }
        }
        System.out.println("The second longest: " + secondLongest);
    }
}