import java.util.Scanner;

class MyUtil
{
	int correctAnswers(char []answer,char []student_answer){
		int cnt=0;
		for(int i=0;i<ques.length;i++){
			if(arr[i]==answer[i])
				cnt++;
		}
		return cnt;
	}
	int incorrectAnswers(char []answer, char []student_answer){
		return 10 - correctAnswers(answer,student_answer);
	}

	boolean isPassed(char []answer,char []student_answer){
		return correctAnswers(answer,student_answer) >=7;
	}
}

class Exam
{
	public static void main(String[] args) 
	{
		String []question = {
		"대한민국의 수도는?"
		,"미국의 수도는?"
		,"모나코의 수도는?"
		,"브라질의 수도는?"
		,"스위스의 수도는?"
		,"싱가포르의 수도는?"
		,"영국의 수도는?"
		,"인도의 수도는?"
		,"캐나다의 수도는?"
		,"터키의 수도는?"};
		String []view = {
			"a)아크라   b)서울   c)코펜아겐   d)야렌"
			,"a)아크라   b)서울   c)코펜아겐   d)야렌"
			,"a)아크라   b)서울   c)코펜아겐   d)야렌"
			,"a)아크라   b)서울   c)코펜아겐   d)야렌"
			,"a)아크라   b)서울   c)코펜아겐   d)야렌"
			,"a)아크라   b)서울   c)코펜아겐   d)야렌"
			,"a)아크라   b)서울   c)코펜아겐   d)야렌"
			,"a)아크라   b)서울   c)코펜아겐   d)야렌"
			,"a)아크라   b)서울   c)코펜아겐   d)야렌"
			,"a)아크라   b)서울   c)코펜아겐   d)야렌"};
		char []answer = {'b','a','c','d','a','b','b','a','c','a'};

		Scanner sc = new Scanner(System.in);
		for(int i=0;i<question.length;i++){
			System.out.println(question[i]);
			System.out.print(view[i]+"==>");
			student_answer[i]=sc.next().charAt(0);
		}
		MyUtil util = new MyUtil();
		int cnt = util.correctAnswers(answer,student_answer);
		
		System.out.printf(" *** 시험 결과 *** ");
		System.out.printf("정답수%d\n",cnt);
		System.out.printf("틀린답수%d\n",util.incorrectAnswers(answer,student_answer));	
		if(util.isPassed(answer,student_answer)){
			System.out.printf("합격여부: %s\n","합격");	
		}else{
			System.out.printf("합격여부: %s\n","불합격");
		}
	}
}

