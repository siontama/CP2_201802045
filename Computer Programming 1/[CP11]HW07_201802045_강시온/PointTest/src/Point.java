/******************************
*
* 컴퓨터프로그래밍 1 (11) HW07
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class Point {
	private int px;
	private int py;
	
	public void set(int x, int y) {				//x, y 설정자
		px = x;
		py = y;
	}
	
	public void print() {						//점의 좌표 출력
		System.out.println("점의 좌표 (x, y) 는 (" + px + ", " + py + ") 입니다.");
	}
}