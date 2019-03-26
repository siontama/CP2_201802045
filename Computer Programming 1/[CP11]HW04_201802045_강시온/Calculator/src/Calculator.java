/******************************
*
* 컴퓨터프로그래밍 1 (11) HW01
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

import java.util.Scanner;

public class Calculator {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		char operator;
		int num1;
		int num2;
		
		System.out.print("문자를 하나 입력하시오. : ");
		operator = input.next().charAt(0);		//연산자를 입력받는다
		System.out.print("숫자 두 개를 입력하시오. : ");
		num1 = input.nextInt();					//첫번째 숫자를 입력받는다
		num2 = input.nextInt();					//두번째 숫자를 입력받는다
		
		if(operator == '+')						//덧셈
		{
			System.out.printf("%d + %d = %d 입니다.",num1,num2,num1+num2);
		}
		else if(operator == '-')				//뺄셈
		{
			System.out.printf("%d - %d = %d 입니다.",num1,num2,num1-num2);
		}
		else if(operator == '*')				//곱셈
		{
			System.out.printf("%d * %d = %d 입니다.",num1,num2,num1*num2);
		}
		else if(operator == '/')				//나눗셈
		{
			if(num2 == 0)						//0으로 나눌때의 예외처리
			{
				System.out.printf("분모가 0이면 나눌 수 없습니다.");
			}
			System.out.printf("%d / %d = %d 입니다.",num1,num2,num1/num2);
		}
		else									//입력받는 문자가 연산자가 아닐경우
		{
			System.out.print("입력한 문자가 연산자가 아닙니다.");
		}
	}

}
