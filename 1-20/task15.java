import java.util.ArrayList;
import java.util.Arrays;

public class task15 {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(12,54,37,82,27,834,90,56,23));
        ArrayList<Integer> evenList = new ArrayList<>();
        ArrayList<Integer> oddList = new ArrayList<>();
        for (Integer num: numbers){
            if (num%2==0) {
                evenList.add(num);
            } else {
                oddList.add(num);
            }
        }
        System.out.println("Original: " + numbers);

        System.out.println("Even numbers: " + evenList);
        System.out.println("Odd numbers: " + oddList);

    }
}