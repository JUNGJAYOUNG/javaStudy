//�迭�� ��Ұ� �ڵ����� �ʱ�ȭ �ǵ���
//Ŭ������ ��������鵵 �ڷ����� ���� �ڵ����� �ʱ�ȭ�ȴ�.

class BankAccount {

  int balance;

  public void setBalance(int b){
	balance=b;
  }

  public int getBalance(){
	  return balance;
  }

  public void deposit(int amount){ //�Ա�
	//balance = balance+amount;
	balance+=amount;
  }
  public void withdraw(int amount){ //����
	balance-=amount; 
  }

  public void printBalance(){
	System.out.println("�����ܰ��"+balance+"���Դϴ�."); 
  }
  //���� �ܾ׿� ���Ͽ� �� 7.5%�� ���ڸ� ����Ͽ� �߰��ϴ� �޼ҵ�
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
		System.out.println("a1�����ܰ�:"+a1.getBalance()); 
		System.out.println("a2�����ܰ�:"+a2.getBalance());
		a1.printBalance();
		//System.out.println(a1.printBalance()); ����!��ȯ���� ���� �޼ҵ带 ��¹��� ȣ���� ���� ����.
		a2.printBalance();

	}
}
