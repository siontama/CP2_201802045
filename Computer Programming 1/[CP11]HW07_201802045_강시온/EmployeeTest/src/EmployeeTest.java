/******************************
*
* 컴퓨터프로그래밍 1 (11) HW07
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class EmployeeTest {
	public static void main(String[] args) {
		Employee employee = new Employee();
		
		employee.setName("홍길동");			//이름 설정
		employee.setNum("010-1111-1111");	//전화번호 설정
		employee.setNalary(3000);			//연봉 설정
		
		System.out.println("직원 이름 : " + employee.getName());	//이름 출력
		System.out.println("전화 번호 : " + employee.getNum());		//전화번호 출력
		System.out.println("연봉 : " + employee.getNalary());		//연봉 출력
	}
}