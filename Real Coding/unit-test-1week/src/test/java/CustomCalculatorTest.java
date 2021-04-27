import org.junit.Test;

import static org.junit.Assert.*;

public class CustomCalculatorTest {
    private CustomCalculator customCalculator;

    //더하기 테스트 진
    @Test
    public void addTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.add(10, 10);

        //테스트 코드 입
        assertTrue(result == 20);
        assertFalse(result == 19);
    }

    @Test
    public void subTest() {
        customCalculator = new CustomCalculator();
        int result = customCalculator.subtract(10, 10);

        assertTrue(result == 0);
    }

    @Test
    public void mulTest() {

    }

    @Test
    public void divTest() {

    }

}