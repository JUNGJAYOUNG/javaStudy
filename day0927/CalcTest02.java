//연습) 사용자한테 두개의 정수를 입력받아 더하기, 빼기, 곱하기, 나누기
//한 결과를 출력하는 프로그램을 작성하고, 저장하고, 컴파일, 실행해봅니다.

import java.util.Scanner;
class CalcTest02{
   public static void main(String []args){
      int num1;
      int num2;
      int plus,sub,mul,div;
      Scanner sc = new Scanner(System.in);
      
      System.out.println("첫번째 수를 입력하세요");
      num1 = sc.nextInt();
      System.out.println("두번째 수를 입력하세요");
      num2 = sc.nextInt();
      plus=num1+num2;
      sub=num1-num2;
      mul=num1*num2;
      div=num1/num2;

      System.out.println("** 결과 출력 **");
      System.out.println("더하기 :"+(num1+num2));
      System.out.println("빼기 :"+(num1-num2)); 
      System.out.println("곱하기 :"+(num1*num2));
      System.out.println("나누기 :"+(num1/num2));     
      }
}