//����: � �л��� �̹� �б⿡ ��ǻ�� ����, c���, ����, ������ �����ߴٰ� ����.
//�� ������ ������ �Է��ϸ� �� �л��� �̹� �б� ��� ������ ����ϴ� ���α׷��� �ۼ��϶�.

import java.util.Scanner;
class AvgScore{

  public static void main(String []args){

     int com, cpro, eng, math;
     int avg;
     Scanner input = new Scanner(System.in);
     System.out.println("�� ������ ������ �Է��ϼ���.");
     System.out.print("��ǻ�Ͱ���:");
     com = input.nextInt();
     System.out.print("c��� ���α׷���:");
     cpro = input.nextInt();
     System.out.print("����:");
     eng = input.nextInt();
     System.out.print("�Ϲݼ���:");
     math = input.nextInt();
     avg=(com+cpro+eng+math)/4;          
     
     System.out.println("**�������:"+avg);
     
}

}