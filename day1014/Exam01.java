class MyUtil
{
	//������ �迭 �ΰ��� �Ű������� ���޹޾� �ϳ��� ���� ��ȯ�ϴ� �޼ҵ�
	public static int[] unionArray(int []a,int []b){
		int length=a.length+b.length;
		int []result= new int[length];
		
		int i;	//result�迭 �ε����� for�� �ۿ� ���������μ� ��� ���� ����.
		for(i=0;i<a.length;i++){
			result[i]=a[i];	
		}
		for(int k=0;k<b.length;k++){
			result[i++]=b[k];
		}
		return result;
	}

	//�Ǽ��� �迭 �ΰ��� �Ű������� ���޹޾� �ϳ��� ���� ��ȯ�ϴ� �޼ҵ�
	public static double[] unionArray(double []a,double []b){
		int length=a.length+b.length;
		double []result= new double[length];
		
		int i;	//result�迭 �ε����� for�� �ۿ� ���������μ� ��� ���� ����.
		for(i=0;i<a.length;i++){
			result[i]=a[i];	
		}
		for(int k=0;k<b.length;k++){
			result[i+k]=b[k];
		}
		return result;
	}

	public static void printArray(int []arr){
		for(int i:arr){	//for each���� ����ؼ� �迭��� �ϳ��� ��������
			System.out.printf("%10d",i);
		}
		System.out.println();
	}

	public static void printArray(double []arr){
		for(double i:arr){	//for each���� ����ؼ� �迭��� �ϳ��� ��������
			System.out.printf("%10.1f",i);
		}
		System.out.println();
	}
}

class Exam01{

	public static void main(String[] args) 
	{
		int []arr1 = {10,20,30};
		int []arr2 = {40,50,60};

		double []c = {2.5,3.4,5.3};
		double []d = {1.4,1.5};

		int []result=MyUtil.unionArray(arr1,arr2);	//static�޼ҵ忩�� Ŭ�����̸�.�޼ҵ������ ȣ��
		double []result2=MyUtil.unionArray(c,d);
		
		MyUtil.printArray(result);	//static�޼ҵ忩�� Ŭ�����̸�.�޼ҵ������ ȣ��
		MyUtil.printArray(result2);
	}
}
