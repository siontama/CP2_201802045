
public class LinkedListTest {
	public static void main(String[] args) {
		List<Integer> list = new LinkedList();
		for(int i=0;i<20;i++)
			list.addLast(i);
		System.out.println("리스트: " + list);
		System.out.println("removeFirst() 호출: "+ list.removeFirst());
		System.out.println("removeLast() 호출: " + list.removeLast());
		System.out.println("remove(4) 호출: " + list.remove(4));
		System.out.println("변경된 리스트: " + list);
		System.out.println("get(5) 호출: " + list.get(5));
		System.out.println("set(5) 호출: " + list.set(5, 6));
		System.out.println("변경된 리스트: " + list);
		System.out.println("indexOf(6) 호출: " + list.indexOf(6));
	}
}
