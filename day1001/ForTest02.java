import java.util.Scanner;
class ForTest02 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n,sum=0; //n은 사용자로부터 입력받기 때문에 꼭 초기화하지 않아도 되지만
					 //sum은 반복문에서 연산을 하기 때문에 반드시 초기값이 있어야 함.
					 //지금은 더하기를 할 것이라서 0으로 초기화함
					 //주어진 문제해결을 위하여 그때그때마다 적합한 값으로 초기화 해야함.

		System.out.print("1부터 어떤수까지 더할까요?");
		n=input.nextInt();
		for(int i=1;i<=n;i++){
			sum+=i;
		}

		System.out.print("1부터"+n+"까지의 합은" +sum+"입니다.");
	}
}
