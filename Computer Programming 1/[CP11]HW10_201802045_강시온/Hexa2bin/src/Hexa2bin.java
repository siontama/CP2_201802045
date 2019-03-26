/******************************
*
* 컴퓨터프로그래밍 1 (11) HW10
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

import java.util.Scanner;

public class Hexa2bin {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String[] hexa2bin = {"0000", "0001", "0010", "0011",	//16진수를 2진수로 변환할 표
				"0100", "0101", "0110", "0111",
				"1000", "1001", "1010", "1011",
				"1100", "1101", "1110", "1111"};
		
		String hexa;								//16진수를 담을 변수
		
		System.out.print("16진수 문자열을 입력하시오 : ");
		hexa = input.nextLine();
		
		String[] bin = new String[hexa.length()];	//변환된 2진수를 담을 변수
		
		for(int i = 0; i < hexa.length(); i++) {
			if(hexa.charAt(i) - 48 >= 1 && hexa.charAt(i) - 48 <= 9) {	//입력된 16진수가 1~9사이일때
				bin[i] = hexa2bin[hexa.charAt(i) - 48];		//아스키코드를 정수로 변환하기 위해서 48을 뺀다
			}
			else if(hexa.charAt(i) - 87 >= 10 && hexa.charAt(i) - 87 <= 15) {	//입력된 16진수가 a~f일때
				bin[i] = hexa2bin[hexa.charAt(i) - 87];		//아스키코드를 정수로 변환하기 위해서 87을 뺀다
			}
		}
		System.out.print("\"" + hexa + "\"에 대한 이진수는 ");
		for(int i = 0; i < hexa.length(); i++) {			//결과 출력
			System.out.print(bin[i] + " ");
		}
		System.out.print("입니다.");
	}
}
