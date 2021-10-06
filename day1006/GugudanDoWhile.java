import java.util.Scanner;
class GugudanDoWhile
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		
		int i,j;

		i=2;
		do{
			j=1;
			do{
				System.out.printf("%d*%d=%d\n",i,j,i*j);
				j++;
			}while(j<=9);
			System.out.println();
			i++;
		}while(i<=9);
	}
}
