import java.util.Scanner;
class Avg90 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		int kor,eng,math;
		double avg;

		System.out.print("�̸�:");
		name = input.next();
		System.out.print("���������� �Է��ϼ���:");
		kor = input.nextInt();
		System.out.print("���������� �Է��ϼ���:");
		eng = input.nextInt();
		System.out.print("���������� �Է��ϼ���:");
		math = input.nextInt();
		
		avg = (kor+eng+math)/3.0;

		if(kor>=90 && avg>=90)
			System.out.print(name +"���� ���б� ���޴�����Դϴ�.");
		else
			System.out.print(name +"���� ���б� ���޴���ڰ� �ƴմϴ�.");
		
	}
}
