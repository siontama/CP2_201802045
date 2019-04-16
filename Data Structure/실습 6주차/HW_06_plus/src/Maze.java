import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class Maze {
    private int n, m;
    private int[][] map;

    public Maze() throws IOException {
        findOpen();
    }

    public void findOpen() throws IOException {
        FileReader fileReader = new FileReader("maze.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);
        String line = "";
        n = Integer.parseInt(bufferedReader.readLine());
        m = Integer.parseInt(bufferedReader.readLine());
        map = new int[n][m];

        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(bufferedReader.readLine(), " ");

            for (int j = 0; j < m; j++) {
                map[i][j] = Integer.parseInt(st.nextToken());
            }
        }
    }

    public boolean isOpen(Pair<Integer, Integer> location) {
        if(location.getRight() < 0 || location.getLeft() < 0 || location.getLeft() >= n || location.getRight() >= m)
            return false;
        return (map[location.getLeft()][location.getRight()] == 0);
    }

    public boolean isArrive(Pair<Integer, Integer> location) {
        return (location.getRight() == m - 1);
    }

    public void markPath(Pair<Integer, Integer> location) {
        map[location.getLeft()][location.getRight()] = 3;
    }

    public void markTried(Pair<Integer, Integer> location) {
        map[location.getLeft()][location.getRight()] = 2;
    }

    public void print() {
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(map[i][j]);
            }
            System.out.println();
        }
        System.out.println();
    }
}
