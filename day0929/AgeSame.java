import java.util.Scanner;
class AgeSame 
{
	public static void main(String[] args) 
	{
		int age1,age2;
		Scanner input = new Scanner(System.in);
		System.out.println("���ϰ� ���� �λ���� ���̸� �Է��ϼ���.");
		age1=input.nextInt();
		age2=input.nextInt();
		
		if(age1==age2)
			System.out.println("�����Դϴ�.");
		else
			System.out.println("������ �ƴմϴ�.");
	}
}
