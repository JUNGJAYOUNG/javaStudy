//�������� �Ф�
import java.util.Scanner;
class DestinyTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name,sign,time;
		int month,day;

		System.out.print("�̸��� �Է��ϼ���:");
		name=input.next();
		System.out.print("�츦 �Է��ϼ���:");
		sign=input.next();
		System.out.print("�¾ ���� �Է��ϼ���:");
		month=input.nextInt();
		System.out.print("�¾ �ϸ� �Է��ϼ���:");
		day=input.nextInt();
		System.out.print("�¾ �ð��� ������������ �Է��ϼ���:");
		time=input.next();
		
		String []list={"��","��","��","��","��","��","��","��","��","��","��","��"};
		String []animal={"��","��","��","�䳢","��","��","��","��","������","��","��","����"};
		String []mean={"õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��"};
		String []user= new String[4];
		
		int index;
		for(int i=0;i<list.length;i++){
			if(sign.equals(animal[i])){
				user[0]=mean[i];
				index=i;
			}
		}
		int move1=index+month-1;
		if(move1>list.length-1){
			move1
		}


				user[1]=mean[i2];
				i2=0;
				int i3=i2+day-1;
				user[2]=mean[i3];
				if(time.equals(list[i])){
					i3=0;
					int i4=i3+i-1;
					user[3]=mean[i4];
		


		System.out.print(name+"���� ����:");
		for(int i=0;i<user.length;i++){	
			System.out.print(user[i]+" ");
		}
    }
}