
public class MovieTest {
	public static void main(String[] args) {
		Movie m1 = new Movie();															//첫번째 영화 객체
		Movie m2 = new Movie("The NoteBook", "Nick Cassavetes", "New Line Cinema");		//두번째 영화 객체
		
		//출력
		System.out.println("m1(no parameter) : "+m1.getTitle()+" / "+m1.getProducer()+" / "+m1.getCompany());
		System.out.println("m2(3 parameter) : "+m2.getTitle()+" / "+m2.getProducer()+" / "+m2.getCompany());
	}
}
