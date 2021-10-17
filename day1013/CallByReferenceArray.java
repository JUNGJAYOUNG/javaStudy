class CallByReferenceArray
{
	//정수형 배열을 매개변수로 전달받아 배열의 모든 요소를 출력하는 메소드
	public static void printArray(int []arr){
		for(int i=0;i<arr.length;i++){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();
	}
	//정수형 배열을 매개변수로 전달받아 배열의 모든 요소를 1씩 증가하는 메소드
	public static void plusOne(int []arr){
		for(int i=0;i<arr.length;i++){
			arr[i]=arr[i]+1;
		}
	}

	public static void main(String[] args) 
	{
		int []arr = {10,20,30};
		printArray(arr);
		plusOne(arr);
		printArray(arr);
	}
}
