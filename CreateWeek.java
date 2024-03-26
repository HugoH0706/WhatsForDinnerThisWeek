import java.util.List;
import java.util.Random;
import java.io.FileWriter;
import java.io.IOException;

public class CreateWeek {
    public static void main(String[] args) {
        AllDishes dishes = new AllDishes();
        int randomIndex;
        Random rand = new Random();
        String filename = "C:/Users/hugoh/Documents/EetWeekSchema.txt";

        randomIndex = rand.nextInt(dishes.getPastaDishes().size());
        Dish pasta = dishes.getPastaDishes().get(randomIndex);

        randomIndex = rand.nextInt(dishes.getRijstDishes().size());
        Dish rijst = dishes.getRijstDishes().get(randomIndex);

        randomIndex = rand.nextInt(dishes.getLekkereDishes().size());
        Dish lekker = dishes.getLekkereDishes().get(randomIndex);

        randomIndex = rand.nextInt(dishes.getAndereDishes().size());
        Dish andere = dishes.getAndereDishes().get(randomIndex);

        Dish avg = dishes.getAVGDish().get(0);
        Dish nieuw = new Dish("Nieuw", 0, 0, 0, "", new Ingredients(List.of(new Ingredient("?", 1, 0, "")),
                List.of(new Ingredient("?", 1, 0, "")),
                List.of(new Ingredient("?", 1, 0, "")),
                List.of(new Ingredient("?", 1, 0, ""))));

        Week week1 = new Week(1, new Day("Maandag", avg), new Day("Dinsdag", pasta), new Day("Woensdag", andere),
                new Day("Donderdag", avg), new Day("Vrijdag", rijst),
                new Day("Zaterdag", nieuw), new Day("Zondag", lekker));

        try {
            FileWriter writer = new FileWriter(filename, false);
            writer.write(week1.toString());
            writer.close();
        } catch (IOException e) {
            System.out.println("Error occurred: " + e.getMessage());
        }
    }
}
