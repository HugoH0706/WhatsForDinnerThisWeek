import java.util.List;

public class Ingredients {
    private List<Ingredient> meat;
    private List<Ingredient> vegetables;
    private List<Ingredient> carbohydrates;
    private List<Ingredient> extras;
    private String meatString = "Vlees: ";
    private String vegetableString = "Groente: ";
    private String carbohydrateString = "Koolhydraten: ";
    private String extrasString = "Extra: ";

    public Ingredients(List<Ingredient> meat, List<Ingredient> vegetables, List<Ingredient> carbohydrates,
            List<Ingredient> extras) {
        this.meat = meat;
        this.vegetables = vegetables;
        this.carbohydrates = carbohydrates;
        this.extras = extras;
    }

    public List<Ingredient> getMeat() {
        return meat;
    }

    public List<Ingredient> getVegetables() {
        return vegetables;
    }

    public List<Ingredient> getCarbohydrates() {
        return carbohydrates;
    }

    public List<Ingredient> getExtras() {
        return extras;
    }

    @Override
    public String toString() {
        for (Ingredient ingr : meat) {
            if (!meatString.contains(ingr.toString())) {
                meatString += ingr + " ";
            }
        }
        for (Ingredient ingr : vegetables) {
            if (!vegetableString.contains(ingr.toString())) {
                vegetableString += ingr + " ";
            }
        }
        for (Ingredient ingr : carbohydrates) {
            if (!carbohydrateString.contains(ingr.toString())) {
                carbohydrateString += ingr + " ";
            }
        }
        for (Ingredient ingr : extras) {
            if (!extrasString.contains(ingr.toString())) {
                extrasString += ingr + " ";
            }
        }
        return meatString + '\n' + vegetableString + '\n' + carbohydrateString + '\n' + extrasString + '\n';
    }
}
