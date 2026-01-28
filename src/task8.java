import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.Set;

public class task8 {
    public static void main(String[] args) {

        ArrayList<String> animals  = new ArrayList<>(Arrays.asList("Dog","Cow","Cat","Bird","Cat"));
        Set<String> set=new LinkedHashSet<>(animals);
        animals = new ArrayList<>(set);

        System.out.println(animals );

    }
}