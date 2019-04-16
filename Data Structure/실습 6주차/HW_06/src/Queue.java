public class Queue extends LinkedList {
    Node head, tail;

    public Queue() {
        head = new Node();
        tail = new Node();

        head.setNext(tail);
        tail.setPrev(head);
    }
    @Override
    int pop() {
        int popnum = head.getNext().getNumber();
        head.setNext(head.getNext().getNext());
        head.getNext().setPrev(head);
        return popnum;
    }

    @Override
    int peak() {
        return head.getNext().getNumber();
    }

    /*public static void main(String[] args) {
        Queue queue = new Queue();
        for (int i = 0; i<10; i++) {
            queue.push(queue.tail, i);
        }
        for (int i=0; i<10; i++) {
            System.out.println(queue.pop());
        }
    }*/
}
