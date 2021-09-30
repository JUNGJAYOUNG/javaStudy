//연습) 이름과 출생연도를 입력받아 나이를 계산하고 나이가 40살이상인지 판별하여
// 무료암검진 대상자인지 결과를 출력하도록 수정

import java.util.Scanner;
class CancerTest02{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age;
      int curyear = 2021;
      int birthyear;

      System.out.println("이름을 입력하세요");
      name=sc.next();
      System.out.println("출생연도를 입력하세요");
      birthyear=sc.nextInt();

      age = curyear - birthyear;
      if(age>=40)
          System.out.println(name + "님, 올해에" +age +"세 입니다. 무료암검진 대상자 입니다.");
      else
          System.out.println(name + "님, 올해에" +age +"세 입니다. 무료암검진 대상자가 아닙니다.");
      
   }
}