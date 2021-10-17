class CallByValueTest  
{
	public static void minusOne(int n){
		n=n-1;
		System.out.println(n);
	}

	public static void main(String[] args) 
	{
		int n=5;
		minusOne(n);
		System.out.println(n);
	}
}
