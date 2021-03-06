
class Bird{
	protected String name;
	protected String color;
	protected boolean wing;
	
	public Bird(String name,String color,boolean wing){
		this.name=name;
		this.color=color;
		this.wing=wing;
	}

	public Bird(){
	}

	public void setName(String name){
		this.name=name;
	}
	public String getName(){
		return name;
	}
	public void setColor(String color){
		this.color=color;
	}
	public String getColor(){
		return color;
	}
	public void setWing(boolean wing){
		this.wing=wing;
	}
	public boolean getWing(){
		return wing;
	}

	public void fly(){
		if(wing == true){
			System.out.printf("%s색 %s가(이) 훨~훨~\n",color,name);
		}else{
			System.out.printf("%s색 %s가(이) 날 수 없어요!\n",color,name);
		}
	}
}

class Airplane extends Bird
{
	private boolean engine;
	public Airplane(String name,String color,boolean wing,boolean engine){
		super(name,color,wing);
		this.engine=engine;
	}
	public Airplane(){
	}
	public void setEngine(boolean engine){
		this.engine = engine;
	}
	public boolean getEngine(){
		return engine;
	}
	public void fly(){
		if( wing && engine ){
			System.out.printf("%s색 %s가(이) 슝~슝~",color,name);
		}else{
			System.out.printf("%s색 %s가(이) 날 수 없어요!",color,name);
		}
	}
}

class BirdTest{

	public static void main(String[] args){
		Bird b1 = new Bird("참새","노란",true);
		Bird b2 = new Bird("비둘기","검은",false);
		b1.fly();
		b2.fly();
		//"다형성"
		//객체에게 시킨 일은 동일한데
		//객체마다 하는 이링 다르다.
		//다형성의 근본원인은 상속과 메소드 오버라이딩이다.

		Airplane a1 = new Airplane("보잉747","하늘",true,true);
		a1.fly();


	}

}