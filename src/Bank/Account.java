package Bank;

public class Account {
	private String ano;
	private String owner;
	private int balance;
	
	public Account(String ano, String owner, int balance) {
		this.ano = ano;
		this.owner = owner;
		this.balance = balance;
	}

	public String getAno() {
		return ano;
	}

	public String getOwner() {
		return owner;
	}

	public int getBalance() {
		return balance;
	}

	public void setBalance(int balance) {
		this.balance = balance;
	}
	 public void showAccountInfo() {
	        System.out.println("계좌번호: " + ano);
	        System.out.println("계좌주: " + owner);
	        System.out.println("잔액: " + balance);
    }
}
