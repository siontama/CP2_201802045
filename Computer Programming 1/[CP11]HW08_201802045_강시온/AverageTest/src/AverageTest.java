/******************************
*
* 컴퓨터프로그래밍 1 (11) HW08
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class AverageTest {
	public static void main(String[] args) {
		Average average = new Average();				//average 객체생성
		
		System.out.println("두 인수(10, 20)의 평균 : " + average.getAverage(10, 20));			//두 인수 average 출력
		System.out.println("세 인수(10, 20, 30)의 평균 : " + average.getAverage(10, 20, 30)); //세 인수 average 출력
	}
}
