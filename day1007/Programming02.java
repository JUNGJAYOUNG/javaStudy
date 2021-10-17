import java.util.Scanner;
class Exam
{
	String []question = {"문제1","문제2","문제3","문제4","문제5","문제6","문제7","문제8","문제9","문제10"};
	String []view = {"a","b","c","c","d","a","b","a","d","c"};
	char []answer = {'','','','','','',','','',','','','};
	static boolean isPassed(String []arr){
		int cnt=0;
		for(int i=0;i<ques.length;i++){
			if(arr[i]!=answer[i])
				cnt++;
		}
		if(cnt>3)
			return false;
		else
			return true;
	}

	static int correctAnswers(String []arr){
		int cnt=0;
		for(int i=0;i<ques.length;i++){
			if(arr[i]==answer[i])
				cnt++;
		}
		return cnt;
	}

	static int incorrectAnswers(String []arr){
		int cnt=0;
		for(int i=0;i<ques.length;i++){
			if(arr[i]!=answer[i])
				cnt++;
		}
		return cnt;
	}


}
class Programming02
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String arr[] = new String[10];
		
		for(int i=0;i<arr.length;i++){
			do{
				System.out.println("답을 입력하세요:");
				arr[i]=input.next();
			}while();
		}


		MyUtil util = new MyUtil();
		int max=util.getMax(age1,age2);
		System.out.println("둘 중 더 큰 수는:"+max);
	}
}

