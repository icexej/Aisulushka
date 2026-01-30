import java.util.ArrayList;
import java.util.Arrays;

public class task06 {
    public static void main(String[] args) {

        ArrayList<String> sports1  = new ArrayList<>(Arrays.asList("Football","Basketball","Tennis","Swimming","Ping-Pong"));
        ArrayList<String> sports2  = new ArrayList<>(Arrays.asList("Football","Tennis","Ping-Pong"));
        boolean result = sports1.containsAll(sports2);
        if(result) {
            System.out.println("Yes, in the general list has all of these sports");
        } else {
            System.out.println("No, there are not some types of sport");
        }
    }
