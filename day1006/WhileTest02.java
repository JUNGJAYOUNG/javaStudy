class WhileTest02
{
	public static void main(String[] args) 
	{
		int dan=2;
		while(dan<=9){
			System.out.printf("***%d´Ü***\n",dan);
			int i=1;
			while(i<=9){
				System.out.printf("%d*%d=%d\n",dan,i,dan*i);
				i++;
			}
			dan++;
			System.out.println();
		}
	}
}
