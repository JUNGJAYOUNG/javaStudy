import java.util.Scanner;
class AreaTest 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);		
		double a,b,result=0.0;
		String r="R",t="T",c="C";
		String cal,name="";
		System.out.print("��������� ������ �Է��ϼ���(R,T,C �� ��1):");
		cal=input.next();

		if(cal.equals(r)){
			name="�簢��";
			System.out.print(name+"�� ����:");
			a=input.nextDouble();
			System.out.print(name+"�� ����:");
			b=input.nextDouble();
			result=a*b;
			System.out.println(name+"�� ����:"+result);
		}else if(cal.equals(t)){
			name="�ﰢ��";
			System.out.print(name+"�� �غ�:");
			a=input.nextDouble();
			System.out.print(name+"�� ����:");
			b=input.nextDouble();
			result=a*b*0.5;
			System.out.println(name+"�� ����:"+result);
		}else if(cal.equals(c)){
			name="��";
			System.out.print(name+"�� ������:");
			a=input.nextDouble();
			result=a*a;
			System.out.println(name+"�� ����:"+result+"��");
		}else{
			System.out.println("�߸��� �Է��Դϴ�.");
		}

	}
}
