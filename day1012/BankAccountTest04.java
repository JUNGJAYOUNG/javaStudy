//�迭�� ��Ұ� �ڵ����� �ʱ�ȭ �ǵ���
//Ŭ������ ��������鵵 �ڷ����� ���� �ڵ����� �ʱ�ȭ�ȴ�.

class BankAccount {

  String name;
  int account;
  int balance;
  double rate;

  public BankAccount(){
	name="���ڿ�";
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
	balance *= 1.075;
  }
	
  public String toString(){
	String result="�̸�:"+name+",���¹�ȣ"+account+",�ܾ�:"+balance+",������:"+rate;
	return result;
  }

}


class BankAccountTest04 
{
	public static void main(String[] args) 
	{
		BankAccount a1 = new BankAccount();
		BankAccount a2 = new BankAccount("���ڿ�",1234,5000000,1.075);
		
		System.out.println(a1);
		System.out.println(a2);

	}
}
