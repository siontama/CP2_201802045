#include<stdio.h>

int monthday[12] = { 31,28,31,30,31,30,31,31,30,31,30,31 };			//월별 일수

int check_data(int year, int month ,int day) {

	if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0))	//윤년체크
		monthday[1]++;												//윤년이라면 2월은 29일
	if ((0 <= year) &&												//년도는 양수
		(0 <= month && month <= 12) &&								//1~12월까지
		(0 <= day && day <= monthday[month - 1])) return 1;			//1~월별일수까지
	monthday[1] = 28;
	return 0;
}

int main()
{
	int year, month, day;
	while (1) {
		scanf("%d %d %d", &year, &month, &day);
		if (year == 0 && month == 0 && day == 0) break;
		else if (check_data(year, month, day)) {					//유효한 날짜
			printf("유효한 날짜입니다\n");
			break;
		}
		printf("유효하지 않은 날짜입니다.\n다시 입력해주세요\n");		//유요하지않은 날짜
	}
}