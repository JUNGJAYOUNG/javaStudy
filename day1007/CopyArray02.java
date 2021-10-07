class CopyArray02
{
	public static void main(String[] args) 
	{
		int []a = {1,2,3,4,5};
		int []b = new int[5];
		
		for(int i=0;i<a.length;i++){	//복사
			b[i]=a[i];
		}

		a[0]=100;	//a배열 값 변경
		
		System.out.println("a배열의 요소");
		for(int i:a){
			System.out.printf("%5d",i);
		}
		System.out.println();
		
		System.out.println("b배열의 요소");
		for(int i:b){
			System.out.printf("%5d",i);
		}		
	}
}
