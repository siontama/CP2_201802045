public interface NodeInterface {
    void setNumber(int numberx, int numbery);
    Pair<Integer, Integer> getNumber();
    void setPrev(Node prev);
    Node getPrev();
    void setNext(Node next);
    Node getNext();
}
