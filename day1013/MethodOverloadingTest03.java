class SistUtil{

	//두개의 실수를 매개변수로 전달받아 그 중에 큰수를 찾아 출력하는 메소드를 정의
	public static void max(double a,double b){
		double max=a;
		if(max<b)
			max=b;
		System.out.println("큰수는"+max+"입니다.");
	}
}

class MethodOverloadingTest03
{
	public static void main(String[] args) 
	{	
		 SistUtil.max(8,4);
		 //꼭 맞는 int를 갖는 메소드가 잇으면 거기로 가지만
		 //없다면 double은 int를 포함하니까 double을 갖는 메소드가 동작합니다.
		 SistUtil.max(5.5,10.2);
	}
}
