import java.util.Scanner;
class PoundToGram 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		double pound,gram;
		System.out.print("�Ŀ�带 �Է��Ͻÿ�:");
		pound=input.nextDouble();
		gram=pound*454;

		System.out.println(pound+"�Ŀ��="+gram+"�׷�");

		
	}
}
