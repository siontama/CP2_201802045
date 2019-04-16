#include <stdio.h>

int main() {
    
    int money;
    
    scanf("%d",&money);
    int money500 = money/500*500;					//500원으로 나눠지는 금액
    money %= 500;									//500원으로 나눈 나머지 금액
    int money100 = money/100*100;					//100원으로 나눠지는 금액
    money %= 100;									//100원으로 나눈 나머지 금액
    int money50 = money/50*50;						//50원으로 나눠지는 금액
    money %= 50;									//50원으로 나눈 나머지 금액
    int money10 = money/10*10;						//10원으로 나눠지는 금액
    money %= 10;									//10원으로 나눈 나머지 금액
    int money1 = money;								//남은금액
													//출력
    printf("500원으로 지급 할 금액 : %d\n",money500);
    printf("100원으로 지급 할 금액 : %d\n",money100);
    printf("50원으로 지급 할 금액 : %d\n",money50);
    printf("10원으로 지급 할 금액 : %d\n",money10);
    printf("1원으로 지급 할 금액 : %d\n",money1);
}
