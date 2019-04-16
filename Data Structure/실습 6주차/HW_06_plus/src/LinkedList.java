abstract class LinkedList {
    public void push(Node target, Pair<Integer, Integer> number) {
        Node next = target;
        Node prev = target.getPrev();
        Node node = new Node(number, prev, next);
p
        next.setPrev(node);
        prev.setNext(node);
    }

    abstract Pair<Integer, Integer> pop();
    abstract Pair<Integer, Integer> peak();
}
