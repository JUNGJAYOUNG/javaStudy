import java.util.Scanner;
class Person
{	
	String name;	//�̸�
	int age;		//����
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

class PersonTest 
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
	}
}
