/******************************
*
* 컴퓨터프로그래밍 1 (11) HW06
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class ComplexNum {
	
	public double real;										//복소수의 정수부분 필드
	public double imag;										//복소수의 허수부분 필드
	
	public void add(double real2, double imag2)				//복소수의 덧셈 메소드
	{
		System.out.printf("복소수1 + 복소수2 = %.1f + %.1fi\n", real+real2, imag+imag2);
	}
	
	public void sub(double real2, double imag2)				//복소수의 뺄셈 메소드
	{
		System.out.printf("복소수1 - 복소수2 = %.1f + %.1fi\n", real-real2, imag-imag2);
	}
	
	public void mul(double real2, double imag2)				//복소수의 곱셈 메소드
	{
		System.out.printf("복소수1 x 복소수2 = %.1f + %.1fi\n", real*real2-imag*imag2, real*imag2+real2*imag);
	}
	
	public void div(double real2, double imag2)				//복소수의 나눗셈 메소드
	{
		if(real2 + imag2 == 0)								//분모가 0일경우의 예외
		{
			System.out.print("복소수2가 0이므로 나눗셈을 수행할 수 없습니다.");
		}
		else												//분모가 0이 아닐 경우
		{
			System.out.printf("복소수1 / 복소수2 = %.1f + %.1fi", (real*real2+imag*imag2)/(real2*real2+imag2*imag2),(imag*real2-real*imag2)/(real2*real2+imag2*imag2));
		}
	}
}
