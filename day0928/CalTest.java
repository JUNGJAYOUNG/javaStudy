//����)��������� �� ���� ������ �Է¹޾� 
//��Ģ������ ������ ����� ������ ���� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
import java.util.Scanner;
class CalTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a;
		int b;
		int add,sub,multi,div,mode;
		System.out.print("ù��° ���� �Է��Ͻÿ�:");
		a = input.nextInt();

		System.out.print("�ι�° ���� �Է��Ͻÿ�:");
		b = input.nextInt();

		add = a+b;
		sub = a-b;
		multi = a*b;
		div = a/b;
		mode = a%b;
		System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"x"+b+"="+multi);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+mode);
		
	}
}