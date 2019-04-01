/******************************
*
* 컴퓨터프로그래밍 1 (11) HW11
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class BookTest {
	public static Book arrayOfBook[];		//Book 객체 배열
	public static void main(String[] args) {
		init();
		
		//책들의 정보를 출력
		System.out.println("book1 : Novel [number=" + arrayOfBook[0].getNumber()
				+ ", title=" + arrayOfBook[0].getTitle()
				+ ", author=" + arrayOfBook[0].getAuthor() + "]");
		System.out.println("book2 : Poet  [number=" + arrayOfBook[1].getNumber()
				+ ", title=" + arrayOfBook[1].getTitle()
				+ ", author=" + arrayOfBook[1].getAuthor() + "]");
		System.out.println("book3 : SF    [number=" + arrayOfBook[2].getNumber()
				+ ", title=" + arrayOfBook[2].getTitle()
				+ ", author=" + arrayOfBook[2].getAuthor() + "]");
		System.out.println("book4 : SF    [number=" + arrayOfBook[3].getNumber()
				+ ", title=" + arrayOfBook[3].getTitle()
				+ ", author=" + arrayOfBook[3].getAuthor() + "]");
		
		//책들의 연체일수와 연체료 출력
		System.out.println("book1(Novel) 4일 연체 : " + arrayOfBook[0].getLateFees(4));
		System.out.println("book2(Poet)  5일 연체 : " + arrayOfBook[1].getLateFees(5));
		System.out.println("book3(SF)    3일 연체 : " + arrayOfBook[2].getLateFees(3));
		
		//동일한 책인지 비교하여 출력
		System.out.println("book4 == book3 ? : " + arrayOfBook[3].equals(arrayOfBook[2]));
		System.out.println("book4 == book1 ? : " + arrayOfBook[3].equals(arrayOfBook[0]));
	}
	
	public static void init() {
		arrayOfBook = new Book[4];
		arrayOfBook[0] = new Novel(1, "Novel1", "author1");			//Book1 객체 생성
		arrayOfBook[1] = new Poet(2, "Poet1", "author2");			//Book2 객체 생성
		arrayOfBook[2] = new ScienceFiction(3, "SF1", "author3");	//Book3 객체 생성
		arrayOfBook[3] = new ScienceFiction(3, "SF1", "author3");	//Book4 객체 생성
	}
}
