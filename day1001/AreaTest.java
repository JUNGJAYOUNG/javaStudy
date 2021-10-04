import java.util.Scanner;
class AreaTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		double a,b,result=0.0;
		String r="R",t="T",c="C";
		String cal,name="";
		System.out.print("면적계산할 도형을 입력하세요(R,T,C 중 택1):");
		cal=input.next();

		if(cal.equals(r)){
			name="사각형";
			System.out.print(name+"의 가로:");
			a=input.nextDouble();
			System.out.print(name+"의 세로:");
			b=input.nextDouble();
			result=a*b;
			System.out.println(name+"의 면적:"+result);
		}else if(cal.equals(t)){
			name="삼각형";
			System.out.print(name+"의 밑변:");
			a=input.nextDouble();
			System.out.print(name+"의 높이:");
			b=input.nextDouble();
			result=a*b*0.5;
			System.out.println(name+"의 면적:"+result);
		}else if(cal.equals(c)){
			name="원";
			System.out.print(name+"의 반지름:");
			a=input.nextDouble();
			result=a*a;
			System.out.println(name+"의 면적:"+result+"π");
		}else{
			System.out.println("잘못된 입력입니다.");
		}

	}
}
