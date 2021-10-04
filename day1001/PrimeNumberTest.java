import java.util.Scanner;
class PrimeNumberTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n,cnt=0;
		System.out.print("n을 입력하세요:");
		n=input.nextInt();
		
		for(int i=1;i<=n;i++){
			if(n%i==0)	//나눳을때 나머지가 0이 되는 수(약수)			
				cnt++;  
		}
		if(cnt==2)	//약수가 2개라면 => 소수라면
			System.out.print(n+"은 소수입니다.");
		else
			System.out.print(n+"은 소수가 아닙니다.");
	}
}
