import java.util.Scanner;
class CalculateTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		double a,b,result=0.0;
		String add="+",sub="-",multi="x",div="/";
		String cal;
		System.out.print("수행할 사칙연산을 입력하세요(\"+,-,x,/중 택 1\"):");
		cal=input.next();
		System.out.print("첫번째수를 입력하세요:");
		a=input.nextDouble();
		System.out.print("두번째수를 입력하세요:");
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
				System.out.println("분모는 0이 아니어야 합니다.");
			}
		}else{
			System.out.println("잘못된 입력입니다.");
		}
		System.out.println("**결과출력:"+result);
	}
}
