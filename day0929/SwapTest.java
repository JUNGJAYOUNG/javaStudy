class SwapTest
{
	public static void main(String[] args) 
	{
		String cup1 ="Ä¿ÇÇ";
		String cup2 ="³ìÂ÷";
		String temp;

		System.out.println("ÄÅ1:" + cup1);
		System.out.println("ÄÅ2:" + cup2);

		temp=cup1;
		cup1=cup2;
		cup2=temp;

		System.out.println("µÎ°³ÀÇ ÄÅÀÇ ³»¿ëÀ» ¹Ù²Ù¾ú½À´Ï´Ù.");
		System.out.println("ÄÅ1:" + cup1);
		System.out.println("ÄÅ2:" + cup2);

	}
}
