import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MagicSquareTest {
    @Test
    void sum() {
        for (int size = 3; size < 100; size += 2) {
            MagicSquare magicSquare = new MagicSquare(size);
            magicSquare.make();
            int sum = (size * ((size * size) + 1)) / 2;
            for (int i = 0 ; i < size; i++) {
                assertEquals(sum, magicSquare.sumColumn(i));
                assertEquals(sum, magicSquare.sumRow(i));
            }
            assertEquals(sum, magicSquare.sumDiagonal());
        }
    }
}