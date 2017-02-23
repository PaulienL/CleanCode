import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 * Created by thomasva on 23/02/2017.
 */
public class GroceryTest {

    @Test
    public void grocery_whenMakingANewGrocery_GroceryHasTheCorrectDayValue(){
        Grocery testGrocery = new Grocery("groceryName");

        DayOfWeek validationDay = LocalDate.now().getDayOfWeek();

        Assertions.assertThat(testGrocery.getDay()).isEqualTo(validationDay);
    }

    @Test
    public void grocery_whenNewGroceryIsMade_CorrectNameShouldBeSet(){

        Grocery testGrocery = new Grocery("groceryName");

        Assertions.assertThat(testGrocery.getName()).isEqualTo("groceryName");
    }
}
