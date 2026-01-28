import java.util.ArrayList;
public class task1 {
    public static void main(String[] args) {

        ArrayList<String> list1 = new ArrayList<>();
        list1.add("1984");
        list1.add("Dune");
        list1.add("Harry Potter");
        list1.add("Brave New World");

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Dune");
        list2.add("Cinderrela");
        list2.add("1984");
        list2.add("The Lord of the Rings");

        ArrayList<String> mergedList = new ArrayList<>();


        for (String book : list1) {
            if (!mergedList.contains(book)) {
                mergedList.add(book);
            }
        }

        for (String book : list2) {
            if (!mergedList.contains(book)) {
                mergedList.add(book);
            }
        }

        System.out.println("Unique books:");
        for (String book : mergedList) {
            System.out.println(book);
        }
    }
}