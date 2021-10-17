import java.util.Scanner;
class MyUtil
{
	boolean checkArray(int []a,int []b){
		if(a.length!=b.length){	//배열의 길이 비교 
			return false;
		}
		for(int i=0;i<a.length;i++){	//배열 같은지 비교
			if(a[i]!=b[i]){
				return false;
			}
		}
		return true;
	}
}

class MethodTest04 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);

		int []a = new int[5];
		int []b = new int[5];

		System.out.println("첫번째 배열 입력");

		for(int i=0;i<a.length;i++){
			System.out.print(i+1+"번째 값을 입력하세요:");
			a[i]=input.nextInt();
		}

		System.out.println("두번째 배열 입력");

		for(int i=0;i<a.length;i++){
			System.out.print(i+1+"번째 값을 입력하세요:");
			b[i]=input.nextInt();
		}
		
		MyUtil util = new MyUtil();
		boolean flag = util.checkArray(a,b);
		if(flag)
			System.out.println("두 배열은 동일합니다.");
		else
			System.out.println("두 배열은 동일하지 않습니다.");
	}
}
