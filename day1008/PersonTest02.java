import java.util.Scanner;
class CellPhone
{	
	String model;	//�̸�
	String company;		//����
	char gender;	//����

	void eat(String food){
		//������ ���� 20�� ȫ�浿 ������ �Ծ��
		System.out.printf("������ %c�� %d�� %s��(��) %s�� �Ծ��\n",gender,age,name,food);
	}

	void sleep(){
		//������ ���� 20�� ȫ�浿�� ���� �ڰ� �վ�� 
		System.out.printf("������ %c�� %d�� %s�� ����~ �ڰ� �־��\n",gender,age,name);
	}
}

class CellPhoneTest
{
	public static void main(String[] args) 
	{
		Person p;
		p = new Person();
		p.name ="����ȣ";
		p.age = 26;
		p.gender='��';
		p.eat("ġ��");
		p.sleep();

		Person kim = new Person();
		kim.name = "��þ�";
		kim.age = 23;
		kim.gender= '��';
		kim.eat("����");
		kim.sleep();
	}
}
