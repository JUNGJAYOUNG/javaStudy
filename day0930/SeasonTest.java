import java.util.Scanner;
class SeasonTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int month;
		System.out.print("���� �Է��ϼ���:");
		month = input.nextInt();
		if(month >12 || month< 1){
			System.out.println("�߸��� �Է��Դϴ�.");
		}else{
			if(month >=3 && month<=5){
				System.out.println("��");	
			}else if(month >=6 && month<=8){
				System.out.println("����");
			}else if(month >=9 && month<=11){
				System.out.println("����");
			}else if(month ==12 || month==1 || month==2){
				System.out.println("�ܿ�");
			}
		}
	}
}
