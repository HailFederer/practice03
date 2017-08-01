package prob05;

public class Account {

	private String accountNo;
	private int balance;
	
	public Account() {
	}
	
	public Account(String accountNo) {
		
		this.accountNo = accountNo;
		System.out.println(this.accountNo+" 계좌가 개설되었습니다.");
	}
	
	public void save(int amount){
		
		this.balance += amount;
		System.out.println(this.accountNo+" 계좌에 "+amount+"만원이 입금되었습니다.");
	}
	
	public void deposit(int amount){
		
		this.balance -= amount;
		System.out.println(this.accountNo+" 계좌에 "+amount+"만원이 출금되었습니다.");
	}
	
	
	public String getAccountNo() {
		return accountNo;
	}
	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}
	public int getBalance() {
		return balance;
	}
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	@Override
	public String toString() {
	
		return "accountNo : "+accountNo+"\nbalance : "+balance;
	}
}
