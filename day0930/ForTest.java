import java.util.Scanner;
class FindMax 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int a,b,c,max;
		System.out.print("첫번째 수를 입력하세요:");
		a=input.nextInt();
		System.out.print("두번째 수를 입력하세요:");
		b=input.nextInt();
		System.out.print("세번째 수를 입력하세요:");
		c=input.nextInt();

		if(a>b){
			if(a>c){		//중첩선택문
		       max=a;
			}else{			//중첩선택문에서는 else는 가장 가까운 if에 대응된다.			            //if에 대응됨.
			   max=c;
			}
		}else{
			if(b>c){
			   max=b;
			}else{
               max=c;
			}
		}
		System.out.println("가장 큰 수는:"+max);
    }
}