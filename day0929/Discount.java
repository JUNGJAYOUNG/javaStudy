import java.util.Scanner;
class Discount 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		int count, price;
		int pay;
		
		System.out.print("��ǰ���� �Է��ϼ���:");
		name = input.next();
		System.out.print("�ܰ��� �Է��ϼ���:");
		price = input.nextInt();
		System.out.print("���ż����� �Է��ϼ���:");
		count = input.nextInt();
		
		pay=price*count;
		
		if (count>=10 || pay >= 20000)
			pay = (int)(pay*0.9);
	
		System.out.println("���ޱݾ�:"+pay);
	}
}
