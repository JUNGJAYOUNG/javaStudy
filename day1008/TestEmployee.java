import java.util.Scanner;
class Employee
{	
	String name;	//�̸�
	String addr;	//�ּ�
	int salary;		//����
	String phone;	//��ȭ��ȣ

}

class TestEmployee 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Employee []emp = new Employee[5];	//�迭 �������� ���� �� �迭 ����
		
		for(int i=0;i<emp.length;i++){
			emp[i] = new Employee();	//��ü ����
			System.out.printf("%d��° ����� �̸�:",i+1);
			emp[i].name=sc.next();
			System.out.printf("%d��° ����� �ּ�:",i+1);
			emp[i].addr=sc.next();
			System.out.printf("%d��° ����� ����:",i+1);
			emp[i].salary=sc.nextInt();
			System.out.printf("%d��° ����� ��ȭ��ȣ:",i+1);
			emp[i].phone=sc.next();

		}

		System.out.println("******��� ����*****");
		System.out.println("�̸�\t�ּ�\t����\t��ȭ��ȣ");
		for(int i=0;i<emp.length;i++){
			
			System.out.printf("%s\t%s\t%d\t%s\n"
				,emp[i].name,emp[i].addr,emp[i].salary,emp[i].phone);
			
		}
	}
}
