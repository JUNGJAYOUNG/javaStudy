import java.util.Scanner;

class Rectangle
{	
	double width;		//���α���
	double height;		//���α���
	
	double getArea(){
		double area = width * height;
		return area;
	}
}

class RectangleTest 
{
	public static void main(String[] args) 
	{
		Rectangle r = new Rectangle();
		r.width = 20.5;
		r.height = 15.7;
		System.out.printf("�簢���� ������%.1f�Դϴ�.\n",r.getArea());
	}
}
