/******************************
*
* 컴퓨터프로그래밍 1 (11) HW10
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class Magazine extends Book {
	private String date;

	public String getDate() {		//date 접근자
		return date;
	}

	public void setDate(String date) {		//date 설정자
		this.date = date;
	}
	
	public Magazine(String title, int page, String author, String date) {	//Magazine 생성자
		super(title, page, author);
		this.date = date;
	}
}
