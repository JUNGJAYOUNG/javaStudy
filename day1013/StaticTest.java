class Family{
	public String name;
	private int age;
	private String role;
	public static String addr;	//Ŭ���� ����(��ü����x ��밡��)

	public Family(String name,int age,String role){
		this.name = name;
		this.age = age;
		this.role = role;
	}

	public Family(){
	}

	public String toString(){
		return "[name:"+name+",age"+age+",role:"+role+".addr"+addr+"]";
	}
	
}

class StaticTest
{
	public static void main(String[] args) 
	{
		Family.addr = "����� ������ ������ 1234";
		System.out.println("�ּ�:"+Family.addr);	//static���� addr�� Ŭ�����̸�.���������� ����

		Family.name = "ȫ�浿";
		System.out.println("�̸�:"+Family.name);
	}
}
/*
C:\javaStudy\day1013>javac StaticTest.java
StaticTest.java:29: error: non-static variable name cannot be referenced from a static context
                Family.name = "ȫ�浿";
                      ^
StaticTest.java:30: error: non-static variable name cannot be referenced from a static context
                System.out.println("�̸�:"+Family.name);
                                               ^
2 errors
*/
//static ����� �ƴ� ���� Ŭ�����̸����� ������ �� ����.