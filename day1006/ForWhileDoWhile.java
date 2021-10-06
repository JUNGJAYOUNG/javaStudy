import java.util.Scanner;
class ForWhileDoWhile
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int n;
		int i,j;

		System.out.print("n을 입력하세요:");
		n=input.nextInt();

		for( i=1;i<=n;i++ ){
			for(j=1;j<=i;j++){
				System.out.print("*");
			}
			System.out.println();
		}

		i=1;
		while(i<=n){
			j=1;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}


		i=1;
		do{
			j=1;
			do{
				System.out.printf("*");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=n);
	}
}
