import java.util.Scanner;
class PriceTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		int num;
		double price;
		System.out.print("������ ������ ������ �Է��ϼ���:");
		num=input.nextInt();
		
		if(num>=10)
			price=(num*100)*0.9;
		else
			price=num*100;

		System.out.println("��ü������"+(int)price+"���Դϴ�.");

	}
}