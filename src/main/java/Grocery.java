import java.time.LocalDate;


import java.time.DayOfWeek;

/**
 * Created by thomasva on 23/02/2017.
 */
public class Grocery {

    private String name;
    private LocalDate dateBought;

    public Grocery(String name) {
        this.name = name;
        this.dateBought = LocalDate.now();
    }

    public DayOfWeek getDay() {
        return dateBought.getDayOfWeek();
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Grocery)) return false;

        Grocery grocery = (Grocery) o;

        return name.equals(grocery.name);
    }

    @Override
    public int hashCode() {
        return name.hashCode();
    }
}
