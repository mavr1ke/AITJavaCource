package homework_36;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

    import java.util.ArrayList;
    import java.util.Arrays;
    import java.util.List;

    import static org.junit.jupiter.api.Assertions.*;

    class HWMainTest {

        @Test
        @DisplayName("is match method test")
        public void IsMatch_test() {
            List<Integer> list1 = Arrays.asList(1, 2, 3, 4);
            List<Integer> list2 = Arrays.asList(5, 2, 3, 8);
            List<String> expectedResult = Arrays.asList("No", "Yes", "Yes", "No");

            List<String> actualResult = HWMain.isMatch(list1, list2);

            assertEquals(expectedResult, actualResult);
        }

        @Test
        @DisplayName("delete bigger numbers method test")
        public void DeleteBiggerNumbers_test() {
            List<Integer> list = new ArrayList<>(Arrays.asList(1, 5, 7, 2, 8, 3));
            int number = 4;
            List<Integer> expectedResult = Arrays.asList(1, 2, 3);

            List<Integer> actualResult = HWMain.deleteBiggerNumbers(list, number);

            assertEquals(expectedResult, actualResult);
        }
    }