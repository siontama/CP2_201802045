/******************************
*
* 컴퓨터프로그래밍 1 (11) HW01
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

import java.util.Scanner;

public class F2C {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		double F; // 입력받을 변수를 선언
		double C; // 변환해서 저장할 변수를 선언
		System.out.print("화씨 온도를 입력하시오: ");
		F = input.nextDouble(); // F를 입력받는다.
		C = 5*(F - 32)/9; // 화씨를 섭씨로 변환한다.
		System.out.print(F+" 화씨온도는 "+C+" 섭씨온도입니다."); // 출력
	}

}
