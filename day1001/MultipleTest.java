//����11��
import java.util.Scanner;
class MultipleTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n;
		System.out.print("������ �Է��ϼ���:");
		n=input.nextInt();
		if(n<0)
			System.out.println("�߸��� �Է��Դϴ�.");
		for(int i=1;i<n;i++){
			if(i%3==0)
				System.out.println(i);
		}
	}
}