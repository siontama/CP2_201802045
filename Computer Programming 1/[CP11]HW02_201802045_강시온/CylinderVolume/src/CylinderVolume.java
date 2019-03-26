/******************************
*
* 컴퓨터프로그래밍 1 (11) HW02
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

import java.util.Scanner;

public class CylinderVolume {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int radius; //반지름
		int height; //높이
		double volume; //부피
		double PI = 3.141592; //상수 파이의 근사값
		
		System.out.print("원기둥 밑면의 반지름을 입력하시오: ");
		radius = input.nextInt(); //반지름을 입력받는다
		
		System.out.print("원기둥의 높이를 입력하시오: ");
		height = input.nextInt(); //높이를 입력받는다
		
		volume = PI*radius*radius*height; //파이*반지름제곱*높이=부피
		
		System.out.print("원기둥의 부피는 " + volume + "입니다."); //출력
	
	}

}
