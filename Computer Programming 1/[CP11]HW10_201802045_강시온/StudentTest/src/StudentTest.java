/******************************
*
* 컴퓨터프로그래밍 1 (11) HW10
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class StudentTest {
	public static void main(String[] args) {
		Student s1 = new Student("s1", 201800000, "cse", 4.0, 130);		//Student 클래스로 s1 객체 생성
		UnderGraduate u1 = new UnderGraduate("u1", 201801234, "cse", 3.8, 150, "argos");	//UnderGraduate 클래스로 u1 객체 생성
		Graduate g1 = new Graduate("g1", 201850000, "cse", 4.3, 90, "ETA", 0.8);		//Graduate 클래스로 g1 객체 생성
		Graduate g2 = new Graduate("g2", 201860000, "cse", 4.2, 60, "LTA", 0.6);		//Graduate 클래스로 g2 객체 생성
		
		System.out.println(s1.toString());		//s1 객체 출력
		System.out.println();
		System.out.println(u1.toString());		//u1 객체 출력
		System.out.println();
		System.out.println(g1.toString());		//g1 객체 출력
		System.out.println();
		System.out.println(g2.toString());		//g2 객체 출력
	}
}
