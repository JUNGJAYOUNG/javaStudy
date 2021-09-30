import java.util.Scanner;
class PoundToGram 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double pound,gram;
		System.out.print("파운드를 입력하시오:");
		pound=input.nextDouble();
		gram=pound*454;

		System.out.println(pound+"파운드="+gram+"그램");

		
	}
}
