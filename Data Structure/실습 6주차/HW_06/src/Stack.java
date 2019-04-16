public class Stack extends LinkedList {
    Node head, tail;

    public Stack() {
        head = new Node();
        tail = new Node();

        head.setNext(tail);
        tail.setPrev(head);
    }
    @Override
    int pop() {
        int popnum = tail.getPrev().getNumber();
        tail.setPrev(tail.getPrev().getPrev());
        tail.getPrev().setNext(tail);
        return popnum;
    }

    @Override
    int peak() {
        return tail.getPrev().getNumber();
    }

    /*public static void main(String[] args) {
        Stack stack = new Stack();
        for (int i = 0; i<10; i++) {
            stack.push(stack.tail, i);
        }
        for (int i=0; i<10; i++) {
            System.out.println(stack.pop());
        }
    }*/
}
