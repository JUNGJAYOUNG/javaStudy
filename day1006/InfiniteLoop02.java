class InfiniteLoop02
{
	public static void main(String[] args) 
	{
		int i=1;
		for( ; ; ){
			System.out.println("Hello!");
			if(i>=3){
				break;
			}
			i++;
		}
	}
}
