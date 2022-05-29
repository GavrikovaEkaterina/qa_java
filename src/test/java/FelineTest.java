import com.example.Feline;
import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;


public class FelineTest {

    private Feline feline;

    @Before
    public void setUp() {
        feline = new Feline();
    }

    @Test
    public void getFoodFelineTest() throws Exception {

        List<String> actualEatMeat = feline.eatMeat();
        List<String> expectedEatMeat = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(actualEatMeat, expectedEatMeat);
    }

    @Test
    public void getFamilyFelineTest() {

        String actualFamily = feline.getFamily();
        String expectedFamily = "Кошачьи";
        assertEquals(actualFamily, expectedFamily);
    }

    @Test
    public void getKittensFelineTest() {

        int actualKittensCount = feline.getKittens();
        int expectedKittensCount = 1;
        assertEquals(actualKittensCount, expectedKittensCount);
    }

}
