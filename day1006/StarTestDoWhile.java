import java.util.Scanner;
class StarTestDoWhile
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int rows,cols;
		System.out.print("줄수를 입력하세요:");
		rows = input.nextInt();
		System.out.print("칸수를 입력하세요:");
		cols = input.nextInt();
		int i,j;

		j=1;
		do{
			i=1;
			do{
				System.out.print("*");
				i++;
			}while(i<=cols);
			System.out.println();
			j++;
		}while(j<=rows);
	}
}
