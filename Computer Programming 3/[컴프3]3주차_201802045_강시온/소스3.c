#include <stdio.h>

int isalpha(int a) {							//인자가 알파벳인지 판단해주는 함수
	return ('a' <= a && a <= 'z') || ('A' <= a && a <= 'Z');
}

int isdigit(int a) {							//인자가 숫자글자인지 판단해주는 함수
	return '0' <= a && a <= '9';
}

int main() {
	char input[6];                           //입력받을 변수명
	int check = 1;                            //1일때 변수이름으로 가능, 0일때 불가능

	input[0] = getchar();                        //변수글자 입력
	input[1] = getchar();
	input[2] = getchar();
	input[3] = getchar();
	input[4] = getchar();
	input[5] = '\0';

	if (!(isalpha(input[0]) || input[0] == '_'))              //첫글자로는 언더바와 영어만 사용가능
		check = 0;
	if (!(isalpha(input[1]) || isdigit(input[1]) || input[1] == '_'))  //두번째부터는 언더바 숫자 영어 사용가능
		check = 0;
	if (!(isalpha(input[2]) || isdigit(input[2]) || input[2] == '_'))
		check = 0;
	if (!(isalpha(input[3]) || isdigit(input[3]) || input[3] == '_'))
		check = 0;
	if (!(isalpha(input[4]) || isdigit(input[4]) || input[4] == '_'))
		check = 0;

	printf("%s %s", input, check ? "True" : "False");            //변수명으로 사용 할 수 있는지 출력
}