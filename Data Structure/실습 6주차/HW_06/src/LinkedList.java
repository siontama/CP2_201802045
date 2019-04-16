abstract class LinkedList {
    public void push(Node target, int number) {
        Node next = target;
        Node prev = target.getPrev();
        Node node = new Node(number, prev, next);

        next.setPrev(node);
        prev.setNext(node);
    }

    abstract int pop();
    abstract int peak();
}
