/******************************
*
* 컴퓨터프로그래밍 1 (11) HW11
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class Book {
	private String title;
	private int number;
	private String author;

	public String getTitle() { // title 접근자
		return title;
	}

	public void setTitle(String title) { // title 설정자
		this.title = title;
	}

	public int getNumber() { // number 접근자
		return number;
	}

	public void setNumber(int page) { // number 설정자
		this.number = page;
	}

	public String getAuthor() { // author 접근자
		return author;
	}

	public void setAuthor(String author) { // author 설정자
		this.author = author;
	}

	public Book(int number, String title, String author) { // Book 생성자
		this.title = title;
		this.number = number;
		this.author = author;
	}

	public boolean equals(Object obj) {	//equals 재정의
		Book other = (Book) obj;
		if (number == other.number)		//관리번호가 동일하면 동일한 책으로 간주
			return true;
		else							//관리번호가 다르면 다른 책으로 간주
			return false;
	}

	public int getLateFees(int days) {	//연체료
		return 0;
	}
}

class Novel extends Book {				//Book 클래스를 상속받은 Novel 클래스
	public int getLateFees(int days) {	//연체료 Novel: 300원/일
		return days * 300;
	}
	
	public Novel(int number, String title, String author) {	//Novle 생성자
		super(number, title, author);
	}
}

class Poet extends Book {				//Book 클래스를 상속받은 Poet 클래스
	public int getLateFees(int days) {	//연체료 Poet: 200원/일
		return days * 200;
	}

	public Poet(int number, String title, String author) {	//Poet 생성자
		super(number, title, author);
	}
}

class ScienceFiction extends Book {		//Book 클래스를 상속받은 ScienceFiction 클래스
	public int getLateFees(int days) {	//연체료 ScienceFiction: 600원/일
		return days * 600;
	}

	public ScienceFiction(int number, String title, String author) {	//ScienceFiction 생성자
		super(number, title, author);
	}
}
