//연습) 정부에서는 격년으로 40세이상인 사람들에게 무료암검진을 실시
//암검진 대상자는 40세 이상이고
//올해가 짝수연도면 짝수연도에 태어난사람
//올해가 홀수연도면 홀수연도에 태어난사람

import java.util.Scanner;
import java.util.Date;
class CancerTest04{

  public static void main(String []args){
     Scanner sc = new Scanner(System.in);
     Date today = new Date();
     String name;
     int birthyear;
     int yearcheck, age, thisyear;     

     System.out.println("이름을 입력하세요.");
     name = sc.next();
     System.out.println("출생년도를 입력하세요.");
     birthyear = sc.nextInt();
     thisyear = today.getYear() + 1900;     
     age = thisyear - birthyear;

     if ( age>=40 && ( birthyear%2 == thisyear%2 ) )
     System.out.println(name +"입장가능");
     else
     System.out.println(name +"입장불가능");
}

}