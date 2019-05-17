/******************************
*
* 컴퓨터프로그래밍 1 (11) HW05
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class Fibonacci {
	public static void main(String[] args) {
		int n = 30;
		long startTime,endTime;
		startTime = System.currentTimeMillis();
		System.out.println(loopFibonacci(n));
		endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime)/1000.0);
		startTime = System.currentTimeMillis();
		System.out.println(recursiveFibonacci(n));
		endTime = System.currentTimeMillis();
		System.out.println((endTime - startTime)/1000.0);
	}
	public static long loopFibonacci(int n) {
		long f0 = 0;									//피보나치수열의 첫번째 항
		long f1 = 1;									//피보나치수열의 두번째 항
		long f2 = 1;
		
		for(int i=0;i<n-1;i++) {
			f2 = f0 + f1;
			f0 = f1;
			f1 = f2;
		}
		return f2;
	}
	public static long recursiveFibonacci(int n) {
		if(n == 0)
			return 0;
		else if(n==1)
			return 1;
		else
			return recursiveFibonacci(n-1)+recursiveFibonacci(n-2);
	}
}
