class CallByReferenceArray
{
	//������ �迭�� �Ű������� ���޹޾� �迭�� ��� ��Ҹ� 1�� ����
	public static void minusOne(double []arr){
		for(int i=0;i<arr.length;i++){
			arr[i] = arr[i] -1;
		}
		printArray(arr);
	}

	//������ �迭�� �Ű������� ���޹޾� �迭�� ��� ��Ҹ� 1�� �����ϴ� �޼ҵ�
	public static void printArray(double []arr){
		for(double a:arr){
			System.out.printf("%10.2f",a);
		}
		System.out.println();
	}

	public static void main(String[] args) 
	{
		double a[] = {2.5,3.5,4.5};
		minusOne(a);
		printArray(a);
	}
}