class Emp
{
	private String name;
	private int sal;
	private String addr;

	public Emp(){
		name ="ȫ�浿";
		sal = 500;
		addr="����";
	}

	public Emp(String name,int sal,String addr){
		this.name = name;
		this.sal = sal;
		this.addr = addr;
	}

	public Emp(String name){
		this.name = name;
		sal=500;
		addr="����";
	}

	public Emp(String name, int sal){
		this.name = name;
		this.sal = sal;
		addr = "����";
	}

	public Emp(int sal,String name){	//������ �޶� �ߺ� ����
		this.name = name;
		this.sal = sal;
		addr = "����";
	}

}


class ConstructorOverloading
{
	public static void main(String[] args) 
	{
		Emp a = new Emp();
		System.out.println(a);
		
		Emp b = new Emp("������",600,"����");
		System.out.println(b);

		Emp c = new Emp(600,"���ڿ�");
		System.out.println(c);

	}
}
