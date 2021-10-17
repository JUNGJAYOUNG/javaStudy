class SistUtil{
	//두개의 정수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의
	public static void max(int a,int b){
		max((double)a,(double)b);
	}

	//두개의 실수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의
	public static void max(double a,double b){
		double max=a;
		if(max<b)
			max=b;
		System.out.println("큰수는"+max+"입니다.");
	}
}

class MethodOverloadingTest02
{
	public static void main(String[] args) 
	{
		 SistUtil.max(8,4);
		 SistUtil.max(5.5,10.2);
	}
}
