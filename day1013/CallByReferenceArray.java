class CallByReferenceArray
{
	//������ �迭�� �Ű������� ���޹޾� �迭�� ��� ��Ҹ� ����ϴ� �޼ҵ�
	public static void printArray(int []arr){
		for(int i=0;i<arr.length;i++){
			System.out.printf("%5d",arr[i]);
		}
		System.out.println();
	}
	//������ �迭�� �Ű������� ���޹޾� �迭�� ��� ��Ҹ� 1�� �����ϴ� �޼ҵ�
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
