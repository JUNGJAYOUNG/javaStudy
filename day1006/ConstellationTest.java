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
		boolean flag=false;
		String yesNo;
		String name;
		int month=0, last=31, day=0;
		String result="";
		
		do{
		
		while(true){
			System.out.print("�̸�==>");
			name=input.next();
			break;
		}

		while(true){
			System.out.print("����==>");
			month=input.nextInt();
			if(month>=1 && month<=12){
				break;
			}
		}

		//�޺� �������� ���
		if(month==2){
			last=28;
		}else if(month==4 || month==6 || month==9 || month==11){
			last=30;		
		}

		while(true){
			System.out.print("����==>");
			day=input.nextInt();
			if(day>=1 && day<=last){
				break;
			}
		}
			
		
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
				   result="�����";
				break;
			case 3:
				if(day<=21)
				   result="�����";
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
			}
			System.out.println(name+"���� ���ڸ���"+result+"�ڸ��Դϴ�.");
			
			do{
				System.out.print("���Ͻðھ��?(y/n)==>");
				yesNo = input.next();
				if (yesNo.charAt(0)=='y'||yesNo.charAt(0)=='Y'){
					flag=true;
				}else if(yesNo.charAt(0)=='n'||yesNo.charAt(0)=='N'){
					flag=false;
				}else{
					//�𸣰ڴ�..
				}
				if(flag==false || flag==true)
					break;
			}while(true);
			if(flag!=true)
				break;
		}while(true);
	}
}
