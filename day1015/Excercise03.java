class Bike
{
	private int gear;
	public int speed;

}

class MountainBike extends Bike
{
	public int seatHeight;
	public void MountainBike(int g);{
		super();
		gear = g;	
		//�θ�Ŭ������ private�������� ����x
		//�θ�Ŭ������ ���鶧�� gear�� protected�� �ϰų�
		//setter�� ���ؼ� �����ؾ� �Ѵ�.
	}
}
class Excercise03
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
