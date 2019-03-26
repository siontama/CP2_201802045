/******************************
*
* 컴퓨터프로그래밍 1 (11) HW06
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

import java.util.Scanner;

public class ComplexNumTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);		//스캐너 객체 생성
		ComplexNum com1 = new ComplexNum();			//첫번째 복소수 객체 생성
		ComplexNum com2 = new ComplexNum();			//두번째 복소수 객체 생성
		
		
		System.out.print("복소수1의 실수값과 허수값을 입력하시오 : ");
		com1.real = input.nextInt();				//첫번째 복소수의 실수부분을 입력
		com1.imag = input.nextInt();				//첫번째 복소수의 허수부분을 입력
		
		System.out.print("복소수2의 실수값과 허수값을 입력하시오 : ");
		com2.real = input.nextInt();				//두번째 복소수의 실수부분을 입력
		com2.imag = input.nextInt();				//두번째 복소수의 허수부분을 입력
		
		System.out.printf("복소수1 : %.1f + %.1fi\n", com1.real, com1.imag);		//첫번째 복소수 출력
		System.out.printf("복소수2 : %.1f + %.1fi\n", com2.real, com2.imag);		//두번째 복소수 출력
		
		com1.add(com2.real, com2.imag);				//복소수 2개의 덧셈
		com1.sub(com2.real, com2.imag);				//복소수 2개의 뺄셈
		com1.mul(com2.real, com2.imag);				//복소수 2개의 곱셈
		com1.div(com2.real, com2.imag);				//복소수 2개의 나눗셈
	}
}
