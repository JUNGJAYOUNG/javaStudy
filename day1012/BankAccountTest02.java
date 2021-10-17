//배열의 요소가 자동으로 초기화 되듯이
//클래스의 멤버변수들도 자료형에 따라 자동으로 초기화된다.
class BankAccount {

  int balance;

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

  //찾으려는 금액이 잔액보다 더 크다면 인출이 일어나지 않도록
  public void withdraw(int amount){ //인출
	if(amount<=balance){
		balance-=amount;
	}else{
		System.out.println("잔액이 부족합니다.");
	}
  }

  public void printBalance(){
	System.out.println("현재잔고는"+balance+"원입니다."); 
  }
  //현재 잔액에 대하여 연 7.5%의 이자를 계산하여 추가하는 메소드
  void addInterest(){
	//balance = balance + balance*0.075;	
    //balance = balance * 1.075;
	balance *= 1.075;
  }

}


class BankAccountTest02 
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.deposit(50);
		a2.deposit(50);
		a1.withdraw(150);
		a2.withdraw(150);
	
		a1.printBalance();
		//System.out.println(a1.printBalance()); 에러!반환값이 없는 메소드를 출력문에 호출할 수는 없다.
		a2.printBalance();
	
	}
}
/*
BankAccount 클래스 앞에 public을 추가하면 다음과 같은 오류가 발생한다.

BankAccountTest02.java:4: error: class BankAccount is public, should be declared in a file named BankAccount.java
public class BankAccount {
       ^
1 error

==>하나의 파일에 두개 이상의 클래스로 구성될 때에는
반드시 main이 있는 클래스이름으로 파일명을 저장해야 하며
그 클래스만이 public 이어야 한다.

*/