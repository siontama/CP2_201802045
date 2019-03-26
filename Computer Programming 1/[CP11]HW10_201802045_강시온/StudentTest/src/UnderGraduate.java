/******************************
*
* 컴퓨터프로그래밍 1 (11) HW10
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class UnderGraduate extends Student {
	private String club;
	
	//UnderGraduate 생성자
	public UnderGraduate(String name, int number, String major, double grade, int credit, String club) {
		super(name, number, major, grade, credit);
		this.club = club;
	}
	
	//UnderGraduate로 만들어진 객체를 출력해 주는 toString
	public String toString() {
		return super.toString() + "\nclub: " + this.club;
	}
}