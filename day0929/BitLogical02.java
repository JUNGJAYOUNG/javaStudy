import java.util.Scanner;
class BitLogical02
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		System.out.println("�λ���� ���̸� �Է��ϼ���.");
		int age1=input.nextInt();
		int age2=input.nextInt();

		if(++age1>=20 && ++age2>=20)
			System.out.println("�λ���� ���̸� 1�� �����ϸ� �λ�� ��� ������ �̻��Դϴ�.");
		else
			System.out.println("�λ���� ���̸� 1�� �����ϸ� �λ�� ��� ������ �̻��� �ƴմϴ�.");
		
		System.out.println("age1:"+age1);
		System.out.println("age2:"+age2);
	
	}
}
