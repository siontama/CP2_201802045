public class Node implements NodeInterface{
    private int number;
    private Node prev;
    private Node next;

    public Node(int number, Node prev, Node next) {
        this.number = number;
        this.prev = prev;
        this.next = next;
    }

    public Node() {
    }

    @Override
    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int getNumber() {
        return this.number;
    }

    @Override
    public void setPrev(Node prev) {
        this.prev = prev;
    }

    @Override
    public Node getPrev() {
        return this.prev;
    }

    @Override
    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public Node getNext() {
        return this.next;
    }
}
