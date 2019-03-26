/******************************
*
* 컴퓨터프로그래밍 1 (11) HW09
* 학번 : 201802045
* 이름 : 강 시 온
*
******************************/

public class BankAccount {
	private String accountNumber;
	private String owner;
	private int balance;
	private double interestRate;
	
	public String getAccountNumber() {			//accountNumber 접근자
		return accountNumber;
	}

	public void setAccountNumber(String accountNumber) {		//accountNumber 설정자
		this.accountNumber = accountNumber;
	}

	public String getOwner() {		//owner 접근자
		return owner;
	}

	public void setOwner(String owner) {	//owner 설정자
		this.owner = owner;
	}

	public int getBalance() {		//balance 접근자
		return balance;
	}

	public void setBalance(int balance) {	//balance 설정자
		this.balance = balance;
	}

	public double getInterestRate() {	//interestRate 접근자
		return interestRate;
	}

	public void setInterestRate(double interestRate) {		//interestRate 설정자
		this.interestRate = interestRate;
	}
	
	public BankAccount() {			//0개 인자 생성자
		accountNumber = "12-345-6-7890";
		owner = "홍길동";
		balance = 300000;
		interestRate = 2.20;
	}

	public BankAccount(String o, String a, int b, double i) {		//3개 인자 생성자
		accountNumber = a;
		owner = o;
		balance = b;
		interestRate = i;
	}
}
