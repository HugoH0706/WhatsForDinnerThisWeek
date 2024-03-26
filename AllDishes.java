import java.util.ArrayList;
import java.util.List;

public class AllDishes {
    private String chorizoPastaInstr = "Create the saus with: paprika, tomaten, ricotta en basilicum. Cut the chorizo into smaller pieces.";
    private String vegaPastaInstr = "";
    private String pestoPastaInstr = "";
    private String kipgehaktInstr = "Oven op 200 graden voor 15 minuten.";

    private String kipKetchapInstr = "";
    private String nasiInstr = "";
    private String pokebowlInstr = "Kook de rijst volgens de aanwijzingen op het pak; 2/3 van de rijst azijn erdoor heen; 1 uur laten afkoelen; zalm in blokjes van 1x1cm snijden; vruchtvlees van peper; peper, soja saus en olie als zalmmarinade.";

    private String avgInstr = "";

    private String soepInstr = "";
    private String wrapInstr = "";

    private String pizzaInstr = "";
    private String kapsalonInstr = "";
    private String pannenkoekenInstr = "";

    private List<Dish> pastaDishes = new ArrayList<>();
    private List<Dish> rijstDishes = new ArrayList<>();
    private List<Dish> andereDishes = new ArrayList<>();
    private List<Dish> lekkereDishes = new ArrayList<>();
    private List<Dish> avgDishes = new ArrayList<>();

    public AllDishes() {
        createPastaDishes();
        createRijstDishes();
        createAndereDishes();
        createAVGDish();
        createLekkereDish();
    }

    public void createPastaDishes() {
        Dish pastaVega = new Dish("Pasta Vega Gehakt", 25, 12, 4, vegaPastaInstr,
                new Ingredients(List.of(new Ingredient("Vega Gehakt", 300, 0, "g")),
                        List.of(new Ingredient("Ui", 50, 0, ""), new Ingredient("Tomaten", 3, 0, ""),
                                new Ingredient("Paprika", 1, 0, "")),
                        List.of(new Ingredient("Pasta", 300, 0, "g")),
                        List.of(new Ingredient("Creme fraiche", 200, 0, "g"),
                                new Ingredient("Mozzarella", 2, 0, " bollen"),
                                new Ingredient("Pijnboompitten", 60, 0, "g"), new Ingredient("Pesto", 50, 0, "g"))));
        Dish pastaChorizo = new Dish("Chorizo Pasta", 40, 19, 4, chorizoPastaInstr,
                new Ingredients(List.of(new Ingredient("Chorizo", 250, 0, "g")),
                        List.of(new Ingredient("Ui", 2, 0, ""), new Ingredient("Knoflook", 3, 0, " tenen"),
                                new Ingredient("Zongedroogde tomaten", 8, 0, ""),
                                new Ingredient("Gegrilde rode paprika", 1, 0, " pot")),
                        List.of(new Ingredient("Penne", 500, 0, "g")),
                        List.of(new Ingredient("Ricotta", 6, 0, " el"), new Ingredient("Basilicum", 15, 0, "g"),
                                new Ingredient("Kaas", 100, 0, "g"), new Ingredient("Mozzarella", 1, 0, " bol"),
                                new Ingredient("Cashew noten", 50, 0, "g"))));
        Dish pastaPesto = new Dish("Pasta Pesto", 30, 10, 4, pestoPastaInstr,
                new Ingredients(List.of(new Ingredient("Kipfilet", 350, 0, "g")),
                        List.of(new Ingredient("Ui", 1, 0, ""), new Ingredient("Knoflook", 2, 0, " tenen"),
                                new Ingredient("Tomaten", 2, 0, ""),
                                new Ingredient("Paprika's", 2, 0, "")),
                        List.of(new Ingredient("Pasta", 300, 0, "g")),
                        List.of(new Ingredient("Chreme fraiche", 200, 0, "g"), new Ingredient("Rucola", 100, 0, "g"),
                                new Ingredient("Parmazaanse Kaas", 1, 0, " bakje"),
                                new Ingredient("Cashew noten", 50, 0, "g"))));
        Dish pastaKipGehaktPesto = new Dish("Ovenpasta met Kipgehakt en Rode Pesto", 35, 15, 4, kipgehaktInstr,
                new Ingredients(List.of(new Ingredient("Kipgehakt", 300, 0, "g")),
                        List.of(new Ingredient("Rode Ui", 1, 0, ""), new Ingredient("Knoflook", 2, 0, " tenen"),
                                new Ingredient("Italiaanse Groentenmix", 1, 0, " pakket")),
                        List.of(new Ingredient("Pasta", 300, 0, "g")),
                        List.of(new Ingredient("Rode Pesto", 100, 0, "g"), new Ingredient("Mascarpone", 100, 0, "g"),
                                new Ingredient("Geraspte Kaas", 100, 0, "g"),
                                new Ingredient("Basilicum", 2, 0, "tl"))));
        pastaDishes.add(pastaVega);
        pastaDishes.add(pastaChorizo);
        pastaDishes.add(pastaPesto);
        pastaDishes.add(pastaKipGehaktPesto);
    }

    public void createRijstDishes() {
        Dish nasi = new Dish("Nasi", 30, 15, 4, nasiInstr,
                new Ingredients(List.of(new Ingredient("Sate stokjes", 2, 0, " pakjes")),
                        List.of(new Ingredient("Ui", 1, 0, ""), new Ingredient("Prei", 1, 0, ""),
                                new Ingredient("Paprika", 2, 0, "")),
                        List.of(new Ingredient("Basmatirijst", 350, 0, "g")),
                        List.of(new Ingredient("Mini Loempia's", 1, 0, " pak"), new Ingredient("Sambal", 2, 0, "el"),
                                new Ingredient("Scrambled Eggs", 8, 0, ""), new Ingredient("Kroepoek", 1, 0, " pak"))));
        Dish rijstKipKetchap = new Dish("Kipfilet Ketchap Rijst maaltijd", 30, 10, 2, kipKetchapInstr,
                new Ingredients(List.of(new Ingredient("Kipfilet", 300, 0, "g")),
                        List.of(new Ingredient("Ui", 2, 0, ""), new Ingredient("Knoflook", 2, 0, " tenen"),
                                new Ingredient("Brocolli", 1, 0, "")),
                        List.of(new Ingredient("Basmatirijst", 200, 0, "g")),
                        List.of(new Ingredient("Ketchap", 1, 0, "/3 fles"), new Ingredient("Sambal", 2, 0, "el"),
                                new Ingredient("Olijfolie", 1, 0, " flinke scheut"))));
        Dish pokeBowlZalm = new Dish("PokeBowl met Zalm", 85, 37, 4, pokebowlInstr,
                new Ingredients(List.of(new Ingredient("Zalm", 340, 0, "g")),
                        List.of(new Ingredient("Rode ui", 1, 0, ""), new Ingredient("Bosui", 3, 0, ""),
                                new Ingredient("Sojabonen", 1, 0, " pakje"), new Ingredient("Avocado", 2, 0, ""),
                                new Ingredient("Mango", 1, 0, ""), new Ingredient("Komkommer", 1, 0, "")),
                        List.of(new Ingredient("Saitaku sushirijst", 300, 0, "g")),
                        List.of(new Ingredient("Saitaku Azijn", 120, 0, "ml"), new Ingredient("Rode peper", 1, 0, "/2"),
                                new Ingredient("Sojasaus", 2, 0, "el"), new Ingredient("Kroepoek", 1, 0, " pak"),
                                new Ingredient("Loempia", 1, 0, " pak"),
                                new Ingredient("Truffelmayo", 1, 0, " fles"))));
        rijstDishes.add(rijstKipKetchap);
        rijstDishes.add(nasi);
        rijstDishes.add(pokeBowlZalm);
    }

    public void createAndereDishes() {
        Dish soep = new Dish("Chineze Tomatensoep", 20, 10, 2, soepInstr,
                new Ingredients(List.of(new Ingredient("Gehaktballetjes", 1, 0, " pak")),
                        List.of(new Ingredient("Verspakket", 1, 0, " pak"),
                                new Ingredient("Salade", 1, 0, "")),
                        List.of(new Ingredient("Chineze Tomatensoep", 1, 0, " pak")),
                        List.of(new Ingredient("Stokbrood", 1, 0, ""),
                                new Ingredient("Aiolie/knoflooksaus", 1, 0, " pot"))));
        Dish wrap = new Dish("Wraps", 20, 10, 4, wrapInstr,
                new Ingredients(List.of(new Ingredient("Kipshoarma", 300, 0, "g")),
                        List.of(new Ingredient("Verspakket", 1, 0, " pak"),
                                new Ingredient("Rode ui", 1, 0, "")),
                        List.of(new Ingredient("Wraps", 1, 0, " pak")),
                        List.of(new Ingredient("Eieren", 8, 0, ""),
                                new Ingredient("Saus", 1, 0, ""))));
        andereDishes.add(soep);
        andereDishes.add(wrap);
    }

    public void createAVGDish() {
        Dish avgDish = new Dish("Aardappel Groente Vlees", 20, 10, 2, avgInstr,
                new Ingredients(
                        List.of(new Ingredient("Krokante Kipsnitsel", 2, 0, " stuks"),
                                new Ingredient("Truffel Biefstuk", 2, 0, " stuks")),
                        List.of(new Ingredient("Snijbonen of Persibonen", 1, 0, " pak"),
                                new Ingredient("Salade", 1, 0, ""),
                                new Ingredient("Brocolli", 1, 0, " stuk")),
                        List.of(new Ingredient("Aardappel Krokketjes", 1, 0, " zak"),
                                new Ingredient("Aardappel Krieltjes", 1, 0, " zak"),
                                new Ingredient("Rosti Rondjes", 1, 0, " zak"),
                                new Ingredient("Aardappels", 1, 0, " zak")),
                        List.of(new Ingredient("Toetje", 1, 0, ""))));
        avgDishes.add(avgDish);
    }

    public void createLekkereDish() {
        Dish pizza = new Dish("Pizza", 20, 10, 2, pizzaInstr,
                new Ingredients(List.of(new Ingredient("Eigen Keuze", 1, 0, "")),
                        List.of(new Ingredient("Eigen Keuze", 1, 0, "")),
                        List.of(new Ingredient("Pizza bodem", 1, 0, "")),
                        List.of(new Ingredient("Tomaten saus", 1, 0, " pot"),
                                new Ingredient("Strooikaas", 1, 0, " zak"))));
        Dish kapsalon = new Dish("Kapsalon", 30, 15, 4, kapsalonInstr,
                new Ingredients(List.of(new Ingredient("Kipgehakt", 300, 0, "g")),
                        List.of(new Ingredient("Komkommer", 1, 0, ""),
                                new Ingredient("Rode ui", 1, 0, ""),
                                new Ingredient("Snoep tomaten", 1, 0, " pak"),
                                new Ingredient("Ijsbergsla", 1, 0, " zak")),
                        List.of(new Ingredient("Friet", 1, 0, " zak")),
                        List.of(new Ingredient("Turkse knoflooksaus", 1, 0, " pot"),
                                new Ingredient("Strooikaas", 1, 0, " zak"))));
        Dish pannenkoeken = new Dish("Pannenkoeken", 20, 10, 2, pannenkoekenInstr,
                new Ingredients(List.of(new Ingredient("?", 0, 0, "")),
                        List.of(new Ingredient("?", 0, 0, "")),
                        List.of(new Ingredient("Pannenkoekenmeel", 1, 0, " pak")),
                        List.of(new Ingredient("Eigen Keuze", 1, 0, ""))));
        lekkereDishes.add(pizza);
        lekkereDishes.add(kapsalon);
        lekkereDishes.add(pannenkoeken);
    }

    public List<Dish> getAVGDish() {
        return avgDishes;
    }

    public List<Dish> getPastaDishes() {
        return pastaDishes;
    }

    public List<Dish> getRijstDishes() {
        return rijstDishes;
    }

    public List<Dish> getAndereDishes() {
        return andereDishes;
    }

    public List<Dish> getLekkereDishes() {
        return lekkereDishes;
    }
}

// 2x AVG, 1x pasta, 1x rijst, 1x andere, 1x lekkers, 1x nieuw