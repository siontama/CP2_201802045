/******************************
*
* 컴퓨터프로그래밍 1 (11) HW10
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class Graduate extends Student {
	private String typeTa;
	private double scholarshipRate;
	
	//Graduate 생성자
	public Graduate(String name, int number, String major, double grade, int credit, String typeTa, double scholarshipRate) {
		super(name, number, major, grade, credit);
		this.typeTa = typeTa;
		this.scholarshipRate = scholarshipRate;
	}
	
	//Graduate로 만들어진 객체를 출력해 주는 toString
	public String toString() {
		return super.toString() + "\ntype of ta: " + this.typeTa + "\nscholarship rate: " + this.scholarshipRate;
	}
}
