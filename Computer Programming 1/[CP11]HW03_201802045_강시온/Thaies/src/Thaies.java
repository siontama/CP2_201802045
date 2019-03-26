/******************************
*
* 컴퓨터프로그래밍 1 (11) HW03
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

import java.util.Scanner;

public class Thaies {
	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		double AC;
		double AE;
		double BC;
		double DE;							
		
		System.out.print("AC : ");
		AC = input.nextDouble();		//AC를 입력받는다.
		System.out.print("AE : ");
		AE = input.nextDouble();		//AE를 입력받는다.
		System.out.print("BC : ");		
		BC = input.nextDouble();		//BC를 입력받는다.
		
		DE=BC*(AE/AC);					//AC : AE = BC : DE 내항의 곱과 외항의 곱은 같다.
		
		System.out.print("DE : "+DE);	//DE의 값을 출력
	}

}
