import java.util.Scanner;
class SeasonTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int month;
		String sea=""; //String �ʱ�ȭ ��������� �����ָ� ������
		System.out.print("���� �Է��ϼ���:");
		month = input.nextInt();
		
		if(month>12 || month<1){
			System.out.println("�߸��� �Է��Դϴ�.");
		}else{
			
			switch(month){
				case 3: 
				case 4:
				case 5:
					sea="��";
					break;
				case 6: 
				case 7: 
				case 8:
					sea="����";
					break;
				case 9: 
				case 10: 
				case 11:
					sea="����";
					break;
				case 12:
				case 1: 
				case 2: 
					sea="�ܿ�";
					break;
			}
			System.out.println(month+"����"+sea+"�Դϴ�.");
		}
		
	}
}