#include<stdio.h>
#include<stdlib.h>

int check(int arr[], int index, int number) {
	if (index > 20) return -1;				//숫자 미발견
	if (arr[index] == number)return index;	//숫자 발견
	return check(arr, index + 1, number);	//다음 인덱스 탐색
}

int main()
{
	int arr[20];
	int number;
	for (int i = 0; i < 20; i++) {			//난수 생성
		arr[i] = rand() % 40 + 10;
	}
	scanf("%d", &number);
	int index = check(arr, 0, number);		//결과
	if (index == -1) {						//숫자 미발견 결과
		printf("검색결과 없음");
	}
	else {									//숫자 발견 결과
		printf("%d", index);
	}
}