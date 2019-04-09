import kr.ac.cnu.ScientificCalculator;
import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class ScientificCalculatorTest {
    Random random = new Random();
    ScientificCalculator calculator = new ScientificCalculator();
    int a = random.nextInt();
    int b = random.nextInt();

    @Test
    void sumTest() {
        assertEquals(a + b, calculator.sum(a, b));
    }

    @Test
    void subTest() {
        assertEquals(a - b, calculator.sub(a, b));
    }

    @Test
    void mulTest() {
        assertEquals(a * b, calculator.mul(a, b));
    }

    @Test
    void divTest() {
        if (b == 0) {
            return;
        }
        assertEquals(a / b, calculator.div(a, b));
    }

    @Test
    void logTest() {
        if (b == 0) {
            return;
        }
        assertEquals(a * Math.log(b), calculator.log(a, b));
    }

    @Test
    void squareTest() {
        assertEquals(Math.pow(a, b), calculator.square(a, b));
    }
}