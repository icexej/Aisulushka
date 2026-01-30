import java.util.ArrayList;
import java.util.Arrays;

public class task20 {
    public static void main(String[] args) {

        ArrayList<ArrayList<String>> departments = new ArrayList<>();
        ArrayList<String> marketing = new ArrayList<>(Arrays.asList("Anya", "Bogdan", "Ayana"));
        ArrayList<String> it = new ArrayList<>(Arrays.asList("Asulu", "Erjan", "Sanjar"));
        ArrayList<String> design = new ArrayList<>(Arrays.asList("Dayana", "Marina", "Davlet"));

        departments.add(marketing);
        departments.add(it);
        departments.add(design);

        for (int i = 0; i < departments.size(); i++) {
            System.out.println("Department " + (i + 1) + ":");
            for (String employee : departments.get(i)) {
                System.out.println(" - " + employee);
            }
        }
    }
}


