class SistUtil{
	
	public static int max(int a,int b){
		int result=a;
		if(b>result)
			result=b;
		return result;
	}
/*
	public static int max(int a,int b,int c){
		int result=max(a,b);
		result = max(result,c);
		return result;
	}
*/
	public static int max(int a,int b,int c){
		return max(max(a,b),c);
	}
	
	public static int max(int a,int b,int c,int d){
		return max(max(a,b),max(c,d));
	}
}


class MethodOverloadingTest04
{
	public static void main(String[] args) 
	{	
		 System.out.println(SistUtil.max(20,30));
		 System.out.println(SistUtil.max(40,90,50));
		 System.out.println(SistUtil.max(50,60,90,70));
	}
}
