/******************************
*
* 컴퓨터프로그래밍 1 (11) HW06
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

import java.util.Scanner;

public class CharCountTest {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String word;
		int vowelcount = 0;					//모음의 갯수
		int consonantcount = 0;				//자음의 갯수
		
		System.out.print("문자열 : ");
		word = input.nextLine();			//문자열을 입력받는다
		word = word.toLowerCase();			//문자의 모음 자음을 판별을 편하게 하기위해 모두 소문자로 변환
		
		for(int i = 0; i < word.length(); i++)	//문자의 길이만큼 한글자씩 판별한다
		{
			if(word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e' || word.charAt(i) == 'o')
			{
				vowelcount++;				//모음일 경우
			}
			else if(word.charAt(i) >= 'a' && word.charAt(i) <= 'z')
			{
				consonantcount++;			//모음이 아닌 알파벳인 경우
			}
		}
		System.out.printf("자음 : %d개\n", consonantcount);		//자음의 갯수 출력
		System.out.printf("모음 : %d개", vowelcount);				//모음의 갯수 출력
	}
}
