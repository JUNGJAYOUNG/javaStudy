//����)��������� �̸��� ��������� �Է¹޾� ����ϰ��� ��������� �Ǻ��Ͽ�
//����� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.
//<ó������>
//-���� �ϰ��� ����ڴ� ���̰� 40�� �̻��̰�, �� �ذ� ¦��������� ¦�������� �¾ ���
//�� �ذ� Ȧ��������� Ȧ�������� �¾ ����Դϴ�.
//40���̻� �ϰ��� �׸��� ����, �����Դϴ�.
//50���̻��̸� �ϰ��� �׸��� ����, ����, �����, �ڱþ��Դϴ�.

import java.util.Scanner;
import java.util.Date; //���� ������ �˱� ���ؼ� 
class FreeCancerScreening 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		Date today = new Date();
		String name;
		String items = "";
		int userYear,age,thisYear;
		thisYear = today.getYear()+1900; //���� ���� �о����

	    System.out.print("�̸�:");
		name = input.next();
		System.out.println("�������:");
		userYear = input.nextInt();
		
		age= thisYear - userYear;
		
		System.out.println(name +"��,���ؿ�"+age+"�� �Դϴ�.");
		if (age>=40 && thisYear%2==userYear%2){
			items="����,����";
			if(age>=50){
				items=items+",�����";
			}
			System.out.println(name+"��"+thisYear+"�� ����ϰ��� ������Դϴ�.");
			System.out.println("�ϰ��� �׸���"+items+" �Դϴ�.");
		}else{
			System.out.println(name+"��"+thisYear+"���� ����ϰ��� ����ڰ� �ƴմϴ�.");
		}
	}
}