/******************************
*
* 컴퓨터프로그래밍 1 (11) HW05
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

import java.util.Scanner;

public class DateCal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);				//스캐너 객채 생성
		int year;
		int month;
		int day;
		int term;
		
		System.out.print("연도를 입력하시오: ");
		year = s.nextInt();								//연도를 입력받는다
		System.out.print("월을 입력하시오: ");
		month = s.nextInt();							//달을 입력받는다
		System.out.print("일을 입력하시오: ");
		day = s.nextInt();								//일을 입력받는다
		
		term = (year - 1900) * 365 + (year - 1900) /4;	//그 해 까지의 일 수를 기간에 더한다
		if(year % 4 == 0 || (year % 100 != 0 && year % 400 == 0))
		{
			term += (year - 1900) / 4;					//윤년일때에 하루를 더한다
			if(month == 2 || month == 1)				//2월이나 1월일때는 아직 2월 29일을 지나지 않았으므로 제외한다
			{
				term--;
			}
		}
		
		if(month == 2)									//그 달까지의 일 수를 더한다
		{
			term += 31;
		}
		else if(month == 3)
		{
			term += 59;
		}
		else if(month == 4)
		{
			term += 90;
		}
		else if(month == 5)
		{
			term += 120;
		}
		else if(month == 6)
		{
			term += 151;
		}
		else if(month == 7)
		{
			term += 181;
		}
		else if(month == 8)
		{
			term += 212;
		}
		else if(month == 9)
		{
			term += 243;
		}
		else if(month == 10)
		{
			term += 273;
		}
		else if(month == 11)
		{
			term += 304;
		}
		else if(month == 12)
		{
			term += 334;
		}
		
		term += day;									//일을 더한다
		
		switch(term%7) {								//기간을 7로 나눴을때의 나머지가 요일이다
		case 1:
			System.out.printf("%d년 %d월 %d일은 월요일입니다.", year, month, day);
			break;
		case 2:
			System.out.printf("%d년 %d월 %d일은 화요일입니다.", year, month, day);
			break;
		case 3:
			System.out.printf("%d년 %d월 %d일은 수요일입니다.", year, month, day);
			break;
		case 4:
			System.out.printf("%d년 %d월 %d일은 목요일입니다.", year, month, day);
			break;
		case 5:
			System.out.printf("%d년 %d월 %d일은 금요일입니다.", year, month, day);
			break;
		case 6:
			System.out.printf("%d년 %d월 %d일은 토요일입니다.", year, month, day);
			break;
		default:
			System.out.printf("%d년 %d월 %d일은 일요일입니다.", year, month, day);
		}
			
	}

}
