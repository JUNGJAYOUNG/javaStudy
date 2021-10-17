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
  public void withdraw(int amount){ //인출
	balance-=amount; 
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


class BankAccountTest 
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount();
		
		a1.deposit(100);
		a2.deposit(50);
		a2.setBalance(50);
		a1.withdraw(150);
		a2.withdraw(150);
		System.out.println("a1현재잔고:"+a1.getBalance()); 
		System.out.println("a2현재잔고:"+a2.getBalance());
		a1.printBalance();
		//System.out.println(a1.printBalance()); 에러!반환값이 없는 메소드를 출력문에 호출할 수는 없다.
		a2.printBalance();

	}
}
