import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void insert() throws IOException {
        Stack stack = new Stack();
        Queue queue = new Queue();

        FileReader fileReader = new FileReader("test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";
        int num[] = new int[10];
        for (int i = 0; (line = bufferedReader.readLine()) != null; i++) {
            num[i] = Integer.parseInt(line);
            stack.push(stack.tail, num[i]);
            queue.push(queue.tail, num[i]);
        }

        for (int i = 0; i < num.length; i++) {
            assertEquals(num[num.length - 1 - i], stack.pop());
            assertEquals(num[i], queue.pop());
        }

        bufferedReader.close();
        fileReader.close();
    }
}