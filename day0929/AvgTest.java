
import java.util.Scanner;
class AvgTest
{
	public static void main(String[] args) 
	{
		
		String name;
		int kor,eng,math;
		double avg;
		Scanner input = new Scanner(System.in);

		System.out.print("�̸�:");
		name=input.next();
		System.out.print("��������:");
		kor=input.nextInt();
		System.out.print("��������:");
		eng=input.nextInt();
		System.out.print("��������:");
		math=input.nextInt();
		
		avg = (double)(kor+eng+math)/3; //double�� type casting�ص� �ǰ�, 
										//3.0���� ������ �Ǽ��� ��� ����

		System.out.println("**�������:"+avg);
		if (avg>=60)
			System.out.print("�հ�");
		else
			System.out.print("���հ�");

	}
}
