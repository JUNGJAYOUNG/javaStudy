
class SistUtil{
	//������ �迭�� �Ű������� ���޹޾� ���� ��ȯ
	public static int sum(int []arr){
		int result=0;
		for(int i=0;i<arr.length;i++){
			result+=arr[i];
		}
		return result;
	}
	//�Ǽ��� �迭�� �Ű������� ���޹޾� ���� ��ȯ
	public static double sum(double []arr){
		double result=0;
		for(int i=0;i<arr.length;i++){
			result+=arr[i];
		}
		return result;
	}
}

class MethodOverloadingTest05
{
	public static void main(String[] args) 
	{	
		 int []a = {1,2,3,4};
		 double []b = {1.5,2.5,3.5,4.5};
		 System.out.println(SistUtil.sum(a));
		 System.out.println(SistUtil.sum(b));		 
	}
}
