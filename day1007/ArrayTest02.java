class ArrayTest02 
{
	public static void main(String[] args) 
	{
		int []a;
		a=new int[5];

		int []b = new int[5];
		boolean []c = new boolean[5];
		double []d = new double[5];
		String []e = new String[5];
		
		a[0]=100;
		b[0]=100;
		
		System.out.println(a[0]);
		System.out.println(b[0]);

		System.out.println(a[1]); //0
		System.out.println(b[1]); //0
		System.out.println(c[1]); //false
		System.out.println(d[1]); //0.0
		System.out.println(e[1]); //null

	}
}
