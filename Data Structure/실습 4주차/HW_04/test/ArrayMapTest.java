import org.junit.jupiter.api.Test;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertFalse;

public class ArrayMapTest {

    @Test
    void getValue() throws IOException {
        ArrayMap arrayMap = new ArrayMap();

        File file = new File("test.txt");
        FileReader fileReader = new FileReader(file);
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        while ((line = bufferedReader.readLine()) != null) {
            for (int i = 0; i < line.length(); i++) {
                arrayMap.put(line.charAt(i) + "");
                assertFalse((arrayMap.getValue(line.charAt(i) + "") == -1));
            }
        }

        bufferedReader.close();
    }
}
