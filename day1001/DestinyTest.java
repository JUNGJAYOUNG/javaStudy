//�������� �Ф�
import java.util.Scanner;
class DestinyTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		int year,month,date,time;
		String result={"õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��"};

		System.out.print("�̸��� �Է��ϼ���:");
		name=input.next();
		System.out.print("�츦 �Է��ϼ���:");
		System.out.print("0:��,1:��,2:��,3:�䳢,4:��,5:��,6:��,7:��,8:������,9:��,10:��,11:����");
		year=input.next();
		System.out.print("�¾ ���� �Է��ϼ���:");
		month=input.nextInt();
		System.out.print("�¾ �ϸ� �Է��ϼ���:");
		day=input.nextInt();
		System.out.print("���ø� �Է��ϼ���:");
		System.out.print("0:��,1:��,2:��,3:��,4:��,5:��,6:��,7:��,8:��,9:��,10:��,11:��");
		time=input.next();
		
		int n = year;
		System.out.println("***"+name+"���� �������� Ǯ��***");
		System.out.println("������ �����"+result[n]);
		n = (n+month-1)%12;
		System.out.println("������ �����"+result[n]);
		n = (n+date-1)%12;
		System.out.println("������ �����"+result[n]);
		n = (n+time)%12;
		System.out.println("������ �����"+result[n]);



    }
}