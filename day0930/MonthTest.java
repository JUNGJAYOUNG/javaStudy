import java.util.Scanner;
class MonthTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int month,day=31;
		System.out.print("���� �Է��ϼ���:");
		month=input.nextInt();
		if(month>12 || month<1){
			System.out.println("�߸��� �Է��Դϴ�.");
		}else{	
			if(month==2){
				day=28;
			}else if(month==4 || month==6 || month==9 || month==11){
				day=30;		
			}
			System.out.println(month+"���� "+day+"�ϱ��� �־��!");
		}
			
	}
		
}
