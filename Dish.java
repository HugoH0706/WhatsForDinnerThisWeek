
public class Dish {
    private String name;
    private int prepTime;
    private int price;
    private int servings;
    private String prepInstruction;
    private Ingredients ingredients;

    public Dish(String name, int prepTime, int price, int servings, String prepInstruction,
            Ingredients ingredients) {
        this.name = name;
        this.prepTime = prepTime;
        this.price = price;
        this.servings = servings;
        this.prepInstruction = prepInstruction;
        this.ingredients = ingredients;
    }

    @Override
    public String toString() {
        return name + "(" + servings + " servings, " + prepTime + " min, $" + price + ")" + '\n' + "Ingredienten: "
                + '\n' + ingredients + "Instructions: " + prepInstruction + '\n';
    }
}