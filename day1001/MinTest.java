import java.util.Scanner;
class MinTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		int a,b,c,min;
		double price;
		System.out.println("3���� ������ �Է��ϼ���");
		
		a=input.nextInt();
		b=input.nextInt();
		c=input.nextInt();
		
		if(a<b){
			if(a<c)
				min=a;
			else
				min=c;
		}else{
			if(b<c)
				min=b;
			else
				min=c;
		}
		System.out.println("���� ���� ������"+min+"�Դϴ�.");

	}
}
