#include<stdio.h>

int main()
{
	char input = getchar();				//입력받을 문자
	printf("Left   :%0c\n", input);		//왼쪽정렬
	printf("Middle :%5c\n", input);		//가운데정렬
	printf("Right  :%10c\n", input);	//오른쪽정렬
}