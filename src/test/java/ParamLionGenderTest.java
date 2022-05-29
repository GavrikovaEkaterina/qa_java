import com.example.Feline;
import com.example.Lion;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import static org.junit.Assert.assertEquals;

public class ParamLionGenderTest {

    @RunWith(Parameterized.class)
    public static class LionGenderTest {

        Feline feline = new Feline();

        private String sex;
        private boolean expectedResult;

        public LionGenderTest(String sex, boolean expectedResult) {
            this.sex = sex;
            this.expectedResult = expectedResult;
        }

        @Parameterized.Parameters
        public static Object[][] getLionData() {
            return new Object[][]{
                    {"Самец", true},
                    {"Самка", false},
            };
        }


        @Test
        public void genderCheckTest() throws Exception {
            Lion lion = new Lion(sex, feline);
            assertEquals(expectedResult, lion.doesHaveMane());
        }
    }
}
