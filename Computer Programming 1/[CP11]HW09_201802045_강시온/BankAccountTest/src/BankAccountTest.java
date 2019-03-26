/******************************
*
* 컴퓨터프로그래밍 1 (11) HW09
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount();											//첫번째 은행계좌 객체
		BankAccount b2 = new BankAccount("김철수", "111-22-3-4444", 500000, 1.70);	//두번째 은행계좌 객체
		
		//출력
		System.out.println("b1(no parameter) : "+b1.getOwner()+" / "+b1.getAccountNumber()+" / "+b1.getBalance()+" / "+b1.getInterestRate());
		System.out.println("b2(4 parameter) : "+b2.getOwner()+" / "+b2.getAccountNumber()+" / "+b2.getBalance()+" / "+b2.getInterestRate());
	}
}
