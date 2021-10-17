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
		//부모클래스의 private영역에는 접근x
		//부모클래스를 만들때에 gear를 protected로 하거나
		//setter를 통해서 접근해야 한다.
	}
}
class Excercise03
{
	public static void main(String[] args) 
	{
		System.out.println("Hello World!");
	}
}
