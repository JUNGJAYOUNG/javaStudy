import java.util.Scanner;

class FindEven 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n, even;
		System.out.println("������ ���� �Է��ϼ���.");

		n=input.nextInt();
		even=(n%2==0)?"¦��":"Ȧ��";

		System.out.println(even);
	}
}
