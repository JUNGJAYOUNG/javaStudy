import java.util.Scanner;
class CalcTest03{
 public static void main(String []args){
     double x;
     double result;
     Scanner input = new Scanner(System.in);
     
     System.out.println("�Ǽ��� �Է��ϼ���:");
     x = input.nextDouble();
     // result = 3*x*x*x - 7*x*x + 9;
     result = 3*Math.pow(x,3) - 7*Math.pow(x,2) + 9;
     System.out.println("�������" +result);

  }
}