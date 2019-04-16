#include<stdio.h>

int main() {
	double input;								//입력받을 실수 값
	scanf("%lf", &input);						//실수 입력
	printf("제곱: %10e\n", input*input);			//제곱 출력
	printf("세제곱: %10e\n", input*input*input);	//세제곱 출력
}