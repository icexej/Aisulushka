import java.util.ArrayList;

public class task02 {
    public static void main(String[] args) {

        ArrayList<String> movies  = new ArrayList<>();
        movies.add("1984");
        movies.add("Dune");
        movies.add("Harry Potter");
        movies.add("Brave New World");

        String longestMovie = "";
        for (String movie: movies) {
            if (movie.length()>longestMovie.length()) {
                longestMovie = movie;
            }
        }
        System.out.println("The longest tittle is " + longestMovie);
    }
}