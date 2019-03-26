/******************************
*
* ��ǻ�����α׷��� 1 (11) HW01
* �й� : 201802045
* �̸� : �� �� ��
*
******************************/

import java.util.Scanner;

public class Mile2Kilometer {
	public static void main(String args[]) {
		
		Scanner input = new Scanner(System.in);
		int mile; // �Է¹��� ������ ����
		double meter; // ��ȯ�ؼ� ������ ������ ����
		System.out.print("������ �Է��Ͻÿ�: ");
		mile = input.nextInt(); // mile�� �Է¹޴´�.
		meter = mile * 1.609; // ������ ų�ι��ͷ� ��ȯ�Ѵ�.
		System.out.print(mile+"������ "+meter+"ų�ι����Դϴ�."); // ���
	}

}
