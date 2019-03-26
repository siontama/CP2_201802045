/******************************
*
* 컴퓨터프로그래밍 1 (11) HW10
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class Student {
	private String name;
	private int number;
	private String major;
	private double grade;
	private int credit;
	
	public String getName() {		//name 접근자
		return name;
	}
	public void setName(String name) {		//name 설정자
		this.name = name;
	}
	public int getNumber() {		//number 접근자
		return number;
	}
	public void setNumber(int number) {		//number 설정자
		this.number = number;
	}
	public String getMajor() {		//major 접근자
		return major;
	}
	public void setMajor(String major) {		//major 설정자
		this.major = major;
	}
	public double getGrade() {		//grade 접근자
		return grade;
	}
	public void setGrade(double grade) {		//grade 설정자
		this.grade = grade;
	}
	public int getCredit() {		//credit 접근자
		return credit;
	}
	public void setCredit(int credit) {		//credit 설정자
		this.credit = credit;
	}
	
	//Student 생성자
	public Student(String name, int number, String major, double grade, int credit) {
		this.name = name;
		this.number = number;
		this.major = major;
		this.grade = grade;
		this.credit = credit;
	}
	
	//Student로 만들어진 객체를 출력해 주는 toString
	public String toString() {
		return "name: " + this.name + "\nnumber: " + this.number + "\nmajor: " + this.major + "\ngrade: " + this.grade + "\ncredit: " + this.credit;
	}
}

