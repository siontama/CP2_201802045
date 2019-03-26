/******************************
*
* 컴퓨터프로그래밍 1 (11) HW07
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class Employee {
	private String name;				//이름 필드
	private String num;					//전화번호 필드
	private int nalary;					//연봉 필드
	
	public String getName() {			//이름 접근자
		return name;
	}
	public void setName(String iname) {	//이름 설정자
		name = iname;
	}
	public String getNum() {			//전화번호 접근자
		return num;
	}
	public void setNum(String inum) {	//전화번호 설정자
		num = inum;
	}
	public int getNalary() {			//연봉 접근자
		return nalary;
	}
	public void setNalary(int inalary) {//연봉 설정자
		nalary = inalary;
	}
	
}