import java.io.IOException;

public class Rat {
    private int dx[] = {0, 0, 1, -1};
    private int dy[] = {1, -1, 0, 0};
    private Pair<Integer, Integer> location = new Pair<>(0, 0);
    private Maze maze = new Maze();
    private Stack path = new Stack();

    public Rat() throws IOException {
    }

    public void solve() {
        move();
    }
    public void move() {
        while(!maze.isArrive(location)) {
            boolean check = false;
            for (int i = 0; i < 4; i++) {
                Pair<Integer, Integer> next = new Pair<>(location.getLeft() + dx[i], location.getRight() + dy[i]);
                if (maze.isOpen(next)) {
                    path.push(path.tail, location);
                    maze.markPath(location);
                    location = next;
                    check = true;
                    break;
                }
            }
            if(!check){
                if (path.tail.getPrev() == path.head) {
                    System.out.println("해가 없습니다");
                    return;
                } else {
                    maze.markTried(location);
                    location = path.pop();
                }
            }
        }
        path.push(path.tail, location);
        maze.markPath(location);
        System.out.println("길을 찾았습니다");
        maze.print();
    }

    public static void main(String[] args) throws IOException {
        Rat rat = new Rat();
        rat.solve();
    }
}
