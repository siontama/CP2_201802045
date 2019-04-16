#include <stdio.h>
#include <stdlib.h>

int main(void) {
	int select, x, y;
	int turn = 0;						//현재의 턴
	char winner = ' ';
	char BLANK = ' ';
	char mark[2] = { 'O', 'X' };		//놓을 말의 종류
	char board[3][3];					//현재의 보드 상태

	for (int i = 0; i < 3; i++) {		//보드 초기화
		for (int j = 0; j < 3; j++) {
			board[i][j] = BLANK;
		}
	}

	printf("LET'S START TIC-TAC-TOE GAME\n");
	printf("PLAY WITH FRIEND   : 1\n");
	printf("PLAY WITH COMPUTER : 2\n");
	printf("SELECT GAME MODE : ");
	scanf("%d", &select);				//게임 모드 선택

	system("cls");						//보드 출력
	printf("x|y[0] | [1] | [2]\n");
	for (int i = 0; i < 3; i++) {
		printf("   --- | --- | ---\n");
		printf("[%d]    |     |    \n", i);
	}printf("   --- | --- | ---\n\n");

	while (winner == ' ') {				//승자가 나올때 까지 게임 진행
		printf("turn : %d\n", turn + 1);
		printf("PLAYER %d's turn (x,y) : ", turn % 2 + 1);
		if(turn % 2 && select == 2){
			x = rand() % 3;
			y = rand() % 3;
		}
		else {
			scanf("%d %d", &x, &y);
		}
		
		while (board[x][y] != ' ') {	//이미 수를 둔곳인지 확인
			printf("Wrong Position !!\n");
			printf("turn : %d\n", turn + 1);
			printf("PLAYER %d's turn (x,y) : ", turn % 2 + 1);
			if (turn % 2 && select == 2) {
				x = rand() % 3;
				y = rand() % 3;
			}
			else {
				scanf("%d %d", &x, &y);
			}
		}
		board[x][y] = mark[turn % 2];

		system("cls");					//현재의 보드 출력
		printf("x|y[0] | [1] | [2]\n");
		for (int i = 0; i < 3; i++) {
			printf("   --- | --- | ---\n");
			printf("[%d] %c  |  %c  |  %c \n", i, board[i][0], board[i][1], board[i][2]);
		}printf("   --- | --- | ---\n\n");

		if (turn >= 4) {				//승자가 결정 되었는지 확인
			for (int i = 0; i < 3; i++) {
				if (board[0][i] == 'X' && board[1][i] == 'X' && board[2][i] == 'X') winner = 'X';
				if (board[0][i] == 'O' && board[1][i] == 'O' && board[2][i] == 'O') winner = 'O';
			}
			for (int i = 0; i < 3; i++) {
				if (board[i][0] == 'X' && board[i][1] == 'X' && board[i][2] == 'X') winner = 'X';
				if (board[i][0] == 'O' && board[i][1] == 'O' && board[i][2] == 'O') winner = 'O';
			}
			if (board[0][0] == 'X' && board[1][1] == 'X' && board[2][2] == 'X') winner = 'X';
			if (board[0][0] == 'O' && board[1][1] == 'O' && board[2][2] == 'O') winner = 'O';
		}
		if (turn >= 8)break;			//9번째 턴부터는 무승부
		turn++;
	}

	if (winner == ' ')printf("DRAW!\n");//결과 출력
	else if (winner == 'O')printf("PLAYER 1's WIN!\n");
	else if (winner == 'X' && select == 1)printf("PLAYER 2's WIN!\n");
	else if (winner == 'X' && select == 2)printf("COMPUTER WIN!\n");
}