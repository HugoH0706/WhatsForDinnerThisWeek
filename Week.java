public class Week {
    private int weekNumber;
    private Day monday;
    private Day tuesday;
    private Day wednesday;
    private Day thursday;
    private Day friday;
    private Day saturday;
    private Day sunday;

    public Week(int weekNumber, Day monday, Day tuesday, Day wednesday, Day thursday, Day friday, Day saturday,
            Day sunday) {
        this.weekNumber = weekNumber;
        this.monday = monday;
        this.tuesday = tuesday;
        this.wednesday = wednesday;
        this.thursday = thursday;
        this.friday = friday;
        this.saturday = saturday;
        this.sunday = sunday;
    }

    @Override
    public String toString() {
        return monday + "" + tuesday + "" + wednesday + "" + thursday + "" + friday + "" + saturday + "" + sunday;
    }
}
