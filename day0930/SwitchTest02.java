import java.util.Scanner;
class SwitchTest02
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("0~9������ ���� �Է��Ͻÿ�:");
		n = input.nextInt();//2
		switch(n){
		   case 1:
		   case 0:	//���̽��ǰ��� ũ�� ������ ���x
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