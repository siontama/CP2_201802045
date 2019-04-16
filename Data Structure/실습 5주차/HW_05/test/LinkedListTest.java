import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest {

    @org.junit.jupiter.api.Test
    void insert() throws IOException {
        LinkedList number[] = new LinkedList[2];
        String lines[] = new String[2];

        FileReader fileReader = new FileReader("test.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        String line = "";
        for (int i = 0; (line = bufferedReader.readLine()) != null; i++) {
            number[i] = new LinkedList();
            lines[i] = line;
            for (int j = 0; j < line.length(); j++) {
                number[i].insert(number[i].tail, line.charAt(j) - '0');
            }
        }

        for (int i = 0; i < 2; i++) {
            Node temp = number[i].head;
            for (int j = 0; j < lines[i].length(); j++) {
                assertEquals(lines[i].charAt(j) - '0', temp.getNext().getNumber());
                temp = temp.getNext();
            }
        }

        bufferedReader.close();
        fileReader.close();
    }
}