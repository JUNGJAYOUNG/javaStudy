import java.util.Scanner;

class CompoundOperator
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int i=1;
		int sum=0;
		
		for(i=1 ; i<=3 ; i++){
			sum += i;
		}

		/*
		sum += i;
		i++;
		sum += i;
		i++;
		sum += i;
		*/
		System.out.println("i:"+i);
		System.out.println("sum:"+sum);

	}
}
