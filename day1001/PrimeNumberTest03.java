import java.util.Scanner;
class PrimeNumberTest03
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n,cnt=0;
		boolean flag = true;
		System.out.print("n을 입력하세요:");
		n=input.nextInt();
		
		for(int i=2;i<n;i++){
			if(n%i==0)
				flag = false;
				break;
		}
		if(flag){
			System.out.println(n+"은 소수입니다.");
		}else{
			System.out.println(n+"은 소수가 아닙니다.");
		}
	}
}
