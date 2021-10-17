class Emp
{
	private String name;
	private int sal;
	private String addr;

	public Emp(){
		name ="홍길동";
		sal = 500;
		addr="서울";
	}

	public Emp(String name,int sal,String addr){
		this.name = name;
		this.sal = sal;
		this.addr = addr;
	}

	public Emp(String name){
		this.name = name;
		sal=500;
		addr="서울";
	}

	public Emp(String name, int sal){
		this.name = name;
		this.sal = sal;
		addr = "서울";
	}

	public Emp(int sal,String name){	//순서가 달라서 중복 가능
		this.name = name;
		this.sal = sal;
		addr = "서울";
	}

}


class ConstructorOverloading
{
	public static void main(String[] args) 
	{
		Emp a = new Emp();
		System.out.println(a);
		
		Emp b = new Emp("김유신",600,"광주");
		System.out.println(b);

		Emp c = new Emp(600,"정자영");
		System.out.println(c);

	}
}
