import java.util.ArrayList;

public class task03 {
    public static void main(String[] args) {

        ArrayList<String> foods  = new ArrayList<>();
        foods.add("Pizza");
        foods.add("Sushi");
        foods.add("Cola");
        foods.add("Pizza");
        foods.add("Pasta");
        foods.add("Manty");
        foods.add("Fri");

        int pizzaCount = 0;
                for(String food: foods){
                    if (food.equals("Pizza")){
                        pizzaCount++;
                    }
                }
        System.out.println("Count of Pizza in the arraylist " + pizzaCount);
    }
}