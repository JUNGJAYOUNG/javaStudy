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

	public static void pro(){
		System.out.println("�ּ�:"+addr);
	}
	
}

class StaticTest03
{
	public static void main(String[] args) 
	{
		Family.addr = "����� ������ ������ 1234";
		System.out.println("�ּ�:"+Family.addr);	//static���� addr�� Ŭ�����̸�.���������� ����
		
		Family.pro();
		Family.toString();

	}
}
/*
StaticTest02.java:34: error: non-static method toString() cannot be referenced from a static context
                Family.toString();
                      ^
1 error
*///static�޼ҵ尡 �ƴϸ� Ŭ�����̸����� ���� �Ұ�