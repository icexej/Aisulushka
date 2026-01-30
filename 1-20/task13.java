import java.util.ArrayList;
import java.util.Arrays;

public class task13 {
    public static void main(String[] args) {
        ArrayList<String> songs = new ArrayList<>(Arrays.asList("Come and go", "Iris", "Heartless", "Often", "Streets"));
        String shortestSong = songs.get(0);
        for (int i = 1; i < songs.size(); i++) {
            String currentSong = songs.get(i);
            if (currentSong.length() < shortestSong.length()) {
                shortestSong = currentSong;
            }
        }
        System.out.println("Original: " + songs);
        System.out.println("Rhe shortest name of song '" + shortestSong + "'");
    }
}