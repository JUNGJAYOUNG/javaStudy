//����) �̸��� ��������� �Է¹޾� ���̸� ����ϰ� ���̰� 40���̻����� �Ǻ��Ͽ�
// ����ϰ��� ��������� ����� ����ϵ��� ����

import java.util.Scanner;
class CancerTest02{
   public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      String name;
      int age;
      int curyear = 2021;
      int birthyear;

      System.out.println("�̸��� �Է��ϼ���");
      name=sc.next();
      System.out.println("��������� �Է��ϼ���");
      birthyear=sc.nextInt();

      age = curyear - birthyear;
      if(age>=40)
          System.out.println(name + "��, ���ؿ�" +age +"�� �Դϴ�. ����ϰ��� ����� �Դϴ�.");
      else
          System.out.println(name + "��, ���ؿ�" +age +"�� �Դϴ�. ����ϰ��� ����ڰ� �ƴմϴ�.");
      
   }
}