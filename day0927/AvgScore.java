//숙제: 어떤 학생이 이번 학기에 컴퓨터 개론, c언어, 영어, 수학을 수강했다고 하자.
//각 과목의 점수를 입력하면 그 학생의 이번 학기 평균 점수를 계산하는 프로그램을 작성하라.

import java.util.Scanner;
class AvgScore{

  public static void main(String []args){

     int com, cpro, eng, math;
     int avg;
     Scanner input = new Scanner(System.in);
     System.out.println("각 과목의 점수를 입력하세요.");
     System.out.print("컴퓨터개론:");
     com = input.nextInt();
     System.out.print("c언어 프로그래밍:");
     cpro = input.nextInt();
     System.out.print("영어:");
     eng = input.nextInt();
     System.out.print("일반수학:");
     math = input.nextInt();
     avg=(com+cpro+eng+math)/4;          
     
     System.out.println("**평균점수:"+avg);
     
}

}