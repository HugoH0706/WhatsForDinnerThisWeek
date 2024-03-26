public class Ingredient {
    private String name;
    private int amount;
    private int calories;
    private String measurement;

    public Ingredient(String name, int amount, int calories, String measurement) {
        this.name = name;
        this.amount = amount;
        this.calories = calories;
        this.measurement = measurement;
    }

    public String getName() {
        return name;
    }

    public int getAmount() {
        return amount;
    }

    public int getCalories() {
        return calories;
    }

    @Override
    public String toString() {
        return name + "(" + amount + measurement + ")";
    }
}
