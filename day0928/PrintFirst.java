//��������� ���ڿ��� �Է¹޾� �� ù���� ���� ���

import java.util.Scanner;
class PrintFirst
{
	public static void main(String[] args) 
	{
		
		Scanner input = new Scanner(System.in);
		String str;
		System.out.println("���ڿ��� �Է��ϼ���");
		str = input.next();
		char first;
		first = str.charAt(0);
		System.out.println(first);
		
		//str = data.charAt(0)+""; //String���� ����� ���� ���� ��� + ""
		//String first = str.substring(0,1); //���ڿ� ����(�ѹ��ڿ�������)
		//System.out.println("ù��° ���ڴ�" + first);
	}
}