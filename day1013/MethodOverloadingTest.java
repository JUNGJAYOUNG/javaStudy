class SistUtil{
	//두개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의
	public void max(int a,int b){
		int max=a;
		if(max<b)
			max=b;
		System.out.println("큰수는"+max+"입니다.");
	}

	//두개의 실수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의
	public void max(double a,double b){
		double max=a;
		if(max<b)
			max=b;
		System.out.println("큰수는"+max+"입니다.");
	}
}

class MethodOverloadingTest
{
	public static void main(String[] args) 
	{
		 SistUtil s1 = new SistUtil();
		 s1.max(8,4);
		 s1.max(5.5,10.2);
	}
}
/*
StaticTest02.java:34: error: non-static method toString() cannot be referenced from a static context
                Family.toString();
                      ^
1 error
*///static메소드가 아니면 클래스이름으로 접근 불가