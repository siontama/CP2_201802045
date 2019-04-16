public class Stack extends LinkedList {
    Node head, tail;

    public Stack() {
        head = new Node();
        tail = new Node();

        head.setNext(tail);
        tail.setPrev(head);
    }
    @Override
    Pair<Integer, Integer> pop() {
        Pair<Integer, Integer> popnum;
        popnum = tail.getPrev().getNumber();
        tail.setPrev(tail.getPrev().getPrev());
        tail.getPrev().setNext(tail);
        return popnum;
    }

    @Override
    Pair<Integer, Integer> peak() {
        return tail.getPrev().getNumber();
    }

}
