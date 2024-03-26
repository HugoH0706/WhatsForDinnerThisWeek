public class Day {
    private String day;
    private Dish d;

    public Day(String day, Dish d) {
        this.day = day;
        this.d = d;
    }

    public String getDay() {
        return day;
    }

    public Dish getDish() {
        return d;
    }

    @Override
    public String toString() {
        return day + ": " + d + '\n';
    }
}
