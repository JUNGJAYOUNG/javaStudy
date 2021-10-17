class Person{

	private String name;
	private int age;

	public Person(){
		name="������";
		age = 20;
	}

	//��� ���� name�� ���� ����(����)�ϴ� �޼ҵ带 ����
	public void setName(String n){
		this.name = n;	//����������� �Ű������� �켱������ ����
	}

	public String getName(){
		return name; //���ϰ��� �ִ�
	}
	
	public void setAge(int n){
		this.age = n;
		return;//�����Ǿ��ִ�.
	}
	public int getAge(){
		return age;
	}

}

class PersonTest03{

	public static void main(String[] args){

		Person p1;

		p1=new Person(); //PersonŬ������ ��ü�� �����Ͽ� p1�� ����
		
		//p1.name = "ȫ�浿";
		//p1.age =20;
		
		p1.setName("ȫ�浿");
		p1.setAge(20);
		
		System.out.println(p1.getName());
		System.out.println(p1.getAge());

	}
}

/*
PersonTest02.java:16: error: name has private access in Person
                p1.name = "ȫ�浿";
                  ^
PersonTest02.java:17: error: age has private access in Person
                p1.age =20;
                  ^
PersonTest02.java:19: error: name has private access in Person
                System.out.println(p1.name);
                                     ^
PersonTest02.java:20: error: age has private access in Person
                System.out.println(p1.age);
                                     ^
4 errors
personŬ������ private������ �Ӽ�(�������)��
���� ������ �� ����.

������ �� �ִ� �޼ҵ带 public�� �����ΰ� ����ؾ� �Ѵ�.
�����ؼ� ���� �����ϴ� �޼ҵ�� setxxx���� �����
�����ؼ� ���� �о���� �޼ҵ�� getxxx�� �����.

�̰��� setter,getter��� �θ���.

����, Ŭ������ ���鶧
������ ��� ����������� private������ �ΰ�
�� private������ ��������� �����ϱ� ����
setter,getter�� public�� ��� �����Ѵ�.

*/