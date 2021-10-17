class Family{
	public String name;
	private int age;
	private String role;
	public static String addr;	//클래스 변수(객체생성x 사용가능)

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
		System.out.println("주소:"+addr);
	}
	
}

class StaticTest03
{
	public static void main(String[] args) 
	{
		Family.addr = "서울시 마포구 서교동 1234";
		System.out.println("주소:"+Family.addr);	//static변수 addr에 클래스이름.변수명으로 접근
		
		Family.pro();
		Family.toString();

	}
}
/*
StaticTest02.java:34: error: non-static method toString() cannot be referenced from a static context
                Family.toString();
                      ^
1 error
*///static메소드가 아니면 클래스이름으로 접근 불가