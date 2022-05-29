import com.example.Cat;
import com.example.Feline;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;

@RunWith(MockitoJUnitRunner.class)
public class CatTest {

    @Mock
    Feline feline;


    @Test
    public void catSoundTest() {

        Cat cat = new Cat(feline);

        String actualSound = cat.getSound();
        String expectedSound = "Мяу";
        assertEquals(actualSound, expectedSound);
    }

    @Test
    public void foodTest() throws Exception {

        Cat cat = new Cat(feline);

        Mockito.when(feline.eatMeat()).thenReturn(Arrays.asList("Животные", "Птицы", "Рыба"));
        List<String> actualFood = cat.getFood();
        List<String> expectedFood = Arrays.asList("Животные", "Птицы", "Рыба");
        assertEquals(expectedFood, actualFood);

    }
}
