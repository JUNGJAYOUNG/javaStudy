import java.util.Scanner;
class CalculateTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		double a,b,result=0.0;
		String add="+",sub="-",multi="x",div="/";
		String cal;
		System.out.print("������ ��Ģ������ �Է��ϼ���(\"+,-,x,/�� �� 1\"):");
		cal=input.next();
		System.out.print("ù��°���� �Է��ϼ���:");
		a=input.nextDouble();
		System.out.print("�ι�°���� �Է��ϼ���:");
		b=input.nextDouble();

		if(cal.equals(add)){
			result=a+b;
		}else if(cal.equals(sub)){
			result=a-b;	
		}else if(cal.equals(multi)){
			result=a*b;
		}else if(cal.equals(div)){
			if(b!=0){			
				result=a/b;
			}else{
				System.out.println("�и�� 0�� �ƴϾ�� �մϴ�.");
			}
		}else{
			System.out.println("�߸��� �Է��Դϴ�.");
		}
		System.out.println("**������:"+result);
	}
}
