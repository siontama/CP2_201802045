import java.util.Scanner;

public class Fibonacci {
	public static void main(String[] args) {
		
		int num;
		Scanner s = new Scanner(System.in);
		
		System.out.print("출력할 항의 갯수 : ");
		num = s.nextInt();
		int f0 = 0;
		int f1 = 1;
		int f2;
		
		for(int i=0;i<num;i++)
		{
			f2 = f0 + f1;
			System.out.printf("f%d = %d\n",i ,f0);
			
			f0 = f1;
			f1 = f2;
		}
	}
}
