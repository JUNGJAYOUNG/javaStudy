import java.util.Scanner;
class CalTest01 
{
	public static void main(String[] args) 
	{
		int data;
		int div1,div2,div3,div4;//��
		int res1,res2,res3;//������
		Scanner input = new Scanner(System.in);
		
		System.out.print("1000�̸��� ������ �Է��Ͻÿ�:");
		data = input.nextInt();

		div1=data/1000;
		res1=data%1000;
		System.out.println("õ�� �ڸ�:"+div1);
		div2=res1/100;
		res2=res1%100;
		System.out.println("���� �ڸ�:"+div2);
		div3=res2/10;
		res3=res2%10;
		System.out.println("���� �ڸ�:"+div3);
		System.out.println("���� �ڸ�:"+res3);
	}
}