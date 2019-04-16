public class LinkedList implements LinkedListInterface {
    Node head, tail;

    public LinkedList() {
        head = new Node();
        tail = new Node();

        head.setNext(tail);
        tail.setPrev(head);
    }

    @Override
    public void insert(Node target, int number) {
        Node prev = target.getPrev();
        Node next = target;
        Node node = new Node(number, prev, next);

        prev.setNext(node);
        next.setPrev(node);
    }

    @Override
    public LinkedList add(LinkedList smallNumber) {
        Node node1 = this.tail.getPrev();
        Node node2 = smallNumber.tail.getPrev();
        boolean check = false;
        while(node2!=smallNumber.head) {
            int number = node1.getNumber() + node2.getNumber();
            if(check){
                number++;
                check = false;
            }
            if(number >= 10){
                check = true;
                number -= 10;
            }
            node1.setNumber(number);
            node1=node1.getPrev();
            node2=node2.getPrev();
        }
        if(check) {
            node1.setNumber(node1.getNumber() + 1);
        }
        return this;
    }

    public static void main(String[] args) {
        LinkedList l1 = new LinkedList();
        LinkedList l2 = new LinkedList();
        String line = "12345678";
        String line2 = "55555";
        for (int j = 0; j < line.length(); j++) {
            l1.insert(l1.tail, line.charAt(j) - '0');
        }
        for (int j = 0; j < line2.length(); j++) {
            l2.insert(l2.tail, line2.charAt(j) - '0');
        }
        System.out.println("첫번째 숫자 : " + line);
        System.out.println("두번째 숫자 : " + line2);
        System.out.print("결과 : ");
        l1.add(l2);
        Node temp = l1.head.getNext();
        while(temp!=l1.tail) {
            System.out.print(temp.getNumber());
            temp = temp.getNext();
        }
        double a,b,x,y,c;

    }
}
