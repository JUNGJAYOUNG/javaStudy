class SigmaTest02
{
	public static void main(String[] args) 
	{
		int result=0;
		for(int i=10;i<=30;i++){
			for(int j=0;j<=5;j++){
				result+=i*j;
			}
		}			
		System.out.println(result);
	}
}
