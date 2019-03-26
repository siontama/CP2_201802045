/******************************
*
* 컴퓨터프로그래밍 1 (11) HW10
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class Book {
	private String title;
	private int page;
	private String author;
	
	public String getTitle() {		//title 접근자
		return title;
	}
	public void setTitle(String title) {	//title 설정자
		this.title = title;
	}
	public int getPage() {		//page 접근자
		return page;
	}
	public void setPage(int page) {		//page 설정자
		this.page = page;
	}
	public String getAuthor() {		//author 접근자
		return author;
	}
	public void setAuthor(String author) {		//author 설정자
		this.author = author;
	}
	
	public Book(String title, int page, String author) {	//Book 생성자
		this.title = title;
		this.page = page;
		this.author = author;
	}
}
