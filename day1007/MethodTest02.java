class MyUtil
{
	static void gugudan(int dan){
		System.out.printf("***%d´Ü***\n",dan);
		for(int i=1;i<=9;i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		return;
	}
}
class MethodTest02
{
	public static void main(String[] args) 
	{
		MyUtil.gugudan(9);
		System.out.println("======");
		MyUtil.gugudan(10);
	}
}
