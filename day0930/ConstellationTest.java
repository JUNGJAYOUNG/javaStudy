 /* ��������� ������ ������ �Է¹޾�
 ���ڸ��� �Ǻ��Ͽ� ����ϴ� ���α׷��� �ۼ��غ���.

 �̸�==>������
 ����==>2
 ����==>9
 �����δ��� ���ڸ��� �����ڸ��Դϴ�.
 */
import java.util.Scanner;
class ConstellationTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name;
		int month, last=31, day;
		String result="";
		boolean flag=true;

		System.out.print("�̸�==>");
		name=input.next();
		System.out.print("����==>");
		month=input.nextInt();
		System.out.print("����==>");
		day=input.nextInt();
		
		//�޺� �������� ���
		if(month==2){
			last=28;
		}else if(month==4 || month==6 || month==9 || month==11){
			last=30;		
		}
		//�Է��� ���ڰ� ���� ��� ���
		if(day>last || day<1){
			System.out.println(month+"���� "+last+"�ϱ��� �־��!");
			flag=false;
		}else{
			
			switch(month){
				case 1:
					if(day<=19)
					   result="����";
					else
					   result="����";
					break;
				case 2:
					if(day<=19)
					   result="����";
					else
					   result="������";
					break;
				case 3:
					if(day<=21)
					   result="������";
					else
					   result="��";
					break;
				case 4:
					if(day<=19)
					   result="��";
					else
					   result="Ȳ��";
					break;
				case 5:
					if(day<=19)
					   result="Ȳ��";
					else
					   result="�ֵ���";
					break;
				case 6:
					if(day<=19)
					   result="�ֵ���";
					else
					   result="��";
					break;
				case 7:
					if(day<=19)
					   result="��";
					else
					   result="����";
					break;
				case 8:
					if(day<=19)
					   result="����";
					else
					   result="ó��";
					break;
				case 9:
					if(day<=19)
					   result="ó��";
					else
					   result="õĪ";
					break;
				case 10:
					if(day<=19)
					   result="õĪ";
					else
					   result="����";
					break;
				case 11:
					if(day<=19)
					   result="����";
					else
					   result="���";
					break;
				case 12:
					if(day<=19)
					   result="���";
					else
					   result="����";
					break;
				default:
					System.out.println("�߸��� �Է��Դϴ�."); //���� 1~12�̿��� ���ڸ� �Է����� ���
				
			}
			if(flag)
				System.out.println(name+"���� ���ڸ��� "+result+"�ڸ��Դϴ�.");

		}
	}
}