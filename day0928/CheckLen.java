//����) ���ڿ��� �Է¹޾� ���ڿ��� ���̰� 4���� �̻����� true, false ���

import java.util.Scanner;
class CheckLen 
{
	public static void main(String[] args) 
	{

		Scanner input = new Scanner(System.in);
		String str;
		boolean check;

		System.out.println("���ڿ��� �Է��ϼ���!");
		str = input.next();
		check = str.length() >= 4;
		System.out.println(check);
		
	}
}
