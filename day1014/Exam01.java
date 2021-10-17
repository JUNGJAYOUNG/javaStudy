class MyUtil
{
	//정수형 배열 두개를 매개변수로 전달받아 하나로 합쳐 반환하는 메소드
	public static int[] unionArray(int []a,int []b){
		int length=a.length+b.length;
		int []result= new int[length];
		
		int i;	//result배열 인덱스를 for문 밖에 선언함으로서 계속 갖고 간다.
		for(i=0;i<a.length;i++){
			result[i]=a[i];	
		}
		for(int k=0;k<b.length;k++){
			result[i++]=b[k];
		}
		return result;
	}

	//실수형 배열 두개를 매개변수로 전달받아 하나로 합쳐 반환하는 메소드
	public static double[] unionArray(double []a,double []b){
		int length=a.length+b.length;
		double []result= new double[length];
		
		int i;	//result배열 인덱스를 for문 밖에 선언함으로서 계속 갖고 간다.
		for(i=0;i<a.length;i++){
			result[i]=a[i];	
		}
		for(int k=0;k<b.length;k++){
			result[i+k]=b[k];
		}
		return result;
	}

	public static void printArray(int []arr){
		for(int i:arr){	//for each구문 사용해서 배열요소 하나씩 꺼내오기
			System.out.printf("%10d",i);
		}
		System.out.println();
	}

	public static void printArray(double []arr){
		for(double i:arr){	//for each구문 사용해서 배열요소 하나씩 꺼내오기
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

		int []result=MyUtil.unionArray(arr1,arr2);	//static메소드여서 클래스이름.메소드명으로 호출
		double []result2=MyUtil.unionArray(c,d);
		
		MyUtil.printArray(result);	//static메소드여서 클래스이름.메소드명으로 호출
		MyUtil.printArray(result2);
	}
}
