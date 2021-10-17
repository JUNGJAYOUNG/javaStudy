class Plane
{
	private String made;
	private String model;
	private int passenger;
	public static int planes;
	
	public Plane(String made,String model,int passenger){
		this.made=made;
		this.model=model;
		this.passenger=passenger;
		planes++;
	}
	public Plane(){	
		planes++;
	}

	public String toString(){
		return made+","+model+","+passenger;
	}

	public void setMade(String made){
		this.made=made;
	}
	public String getMade(){
		return made;
	}

	public void setModel(String model){
		this.model=model;
	}
	public String getModel(){
		return model;
	}

	public void setPassenger(int passenger){
		this.passenger = passenger;
	}
	public int getPassenger(){
		return passenger;
	}
	public static void setPlanes(int planes){
		planes = planes;
	}
	public static int getPlanes(){
		return planes;
	}


}


class PlaneTest
{
	
	public static void main(String[] args) 
	{
		Plane p1 = new Plane();
		Plane p2 = new Plane("대한항공","A340",300);
		Plane p3 = new Plane("아시아나","B123",500);
		Plane p4 = new Plane("아시아나","B123",500);
		System.out.println(p1);
		p1.setMade("에어서울");
		p1.setModel("C128");
		p1.setPassenger(200);
		System.out.println(p1);
		System.out.println(p2);
		p2.getModel();
		
		System.out.println(Plane.planes+"대");

	}
}




