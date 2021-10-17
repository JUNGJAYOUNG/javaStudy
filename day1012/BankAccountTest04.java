//배열의 요소가 자동으로 초기화 되듯이
//클래스의 멤버변수들도 자료형에 따라 자동으로 초기화된다.

class BankAccount {

  String name;
  int account;
  int balance;
  double rate;

  public BankAccount(){
	name="정자영";
	account=0001;
	rate=1.0;
  }

  public BankAccount(String name,int account,int balance,double rate){
	this.name=name;
	this.account=account;
	this.balance=balance;
	this.rate=rate;
  }

  public void setBalance(int b){
	balance=b;
  }

  public int getBalance(){
	  return balance;
  }

  public void deposit(int amount){ //입금
	//balance = balance+amount;
	balance+=amount;
  }
  public void withdraw(int amount){ //인출
	balance-=amount; 
  }

  public void printBalance(){
	System.out.println("현재잔고는"+balance+"원입니다."); 
  }
  //현재 잔액에 대하여 연 7.5%의 이자를 계산하여 추가하는 메소드
  void addInterest(){
	balance *= 1.075;
  }
	
  public String toString(){
	String result="이름:"+name+",계좌번호"+account+",잔액:"+balance+",이자율:"+rate;
	return result;
  }

}


class BankAccountTest04 
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount("정자영",1234,5000000,1.075);
		
		System.out.println(a1);
		System.out.println(a2);

	}
}
