import java.util.Scanner;
class SwitchTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("0~9������ ���� �Է��Ͻÿ�:");
		n = input.nextInt();
		switch(n){
		   case 0:
			   System.out.println("��");
		   case 1:
			   System.out.println("��");
		   case 2:
			   System.out.println("��");
			   break;
		   case 3:
			   System.out.println("��");
		   case 4:
			   System.out.println("��");
		   case 5:
			   System.out.println("��");
			   break;
		   case 6:
			   System.out.println("��");
			   break;
		   case 7:
			   System.out.println("ĥ");
			   break;
		   case 8:
			   System.out.println("��");
			   break;
		   case 9:
			   System.out.println("��");
			   break;
		   default:
			   System.out.println("�Է¹����� �Ѿ����ϴ�.");
		}
	}
}