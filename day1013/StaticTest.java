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
	
}

class StaticTest
{
	public static void main(String[] args) 
	{
		Family.addr = "서울시 마포구 서교동 1234";
		System.out.println("주소:"+Family.addr);	//static변수 addr에 클래스이름.변수명으로 접근

		Family.name = "홍길동";
		System.out.println("이름:"+Family.name);
	}
}
/*
C:\javaStudy\day1013>javac StaticTest.java
StaticTest.java:29: error: non-static variable name cannot be referenced from a static context
                Family.name = "홍길동";
                      ^
StaticTest.java:30: error: non-static variable name cannot be referenced from a static context
                System.out.println("이름:"+Family.name);
                                               ^
2 errors
*/
//static 멤버가 아닌 것은 클래스이름으로 접근할 수 없다.