class Food{
	protected double cal; //자식 클래스에게만 접근 허용 protected
	protected int price;
	protected double gram;
		
	public Food(double cal, int price, double gram){
		this.cal=cal;
		this.price=price;
		this.gram=gram;
	}
	public Food(){

	}	
	public double getCal(){
		return cal;
	}
	public void setCal(double cal){
		this.cal=cal;
	}
	public int getPrice(){
		return price;
	}
	public void setPrice(int price){
		this.price=price;
	}
	
	public double getGram(){
		return gram;
	}
	public void setGram(double gram){
		this.gram=gram;
	}

	public String toString(){
		return "칼로리:"+cal+",가격:"+price+",중량:"+gram;
	}
}

class Melon extends Food
{
	private String farm;

	public Melon(double cal, int price, double gram, String farm){
		super(cal,price,gram);
		this.farm=farm;
	}
	public Melon(){
		//super();생략
	}

	public void setFarm(String farm){
		this.farm=farm;
	}
	public String getFarm(){
		return farm;
	}
	public void printInfo(Melon m){
		System.out.printf("칼로리:%f\n"+cal);
		System.out.printf("가격:%d\n"+m.price);
		System.out.printf("중량:%.1fkg\n"+m.gram);
		System.out.printf("경작 농원:%s\n"+m.farm);
	}
	//오버라이딩(재정의:부모의 메소드와 매개변수와 반환하는값 모두 일치해야함)
	public String toString(){
		return super.toString()+",경작농원:"+farm;
		//super.메소드명 부모클래스의 동일한 메소드를 호출할때
	}


}

class Milk extends Food{
	private String brand;
	public Milk(double cal,int price,double gram,String brand){
		super(cal,price,gram);
		this.brand=brand;
	}
	public Milk(){
	}

	public void setBrand(String brand){
		this.brand = brand;
	}
	public String getBrand(){
		return brand;
	}
	public String toString(){
		return super.toString()+",브랜드:"+brand;
		//super.메소드명 부모클래스의 동일한 메소드를 호출할때
	}

}
class InheritanceTestMelon
{
	public static void main(String[] args) 
	{
		Food f = new Food(200,3000,0.6);
		Melon m = new Melon(450,18000,1.5,"쌍용농원");
		Milk milk = new Milk(200,500,9.2,"서울우유");
		System.out.println(f);
		System.out.println(m);
		System.out.println(milk);
		//부모 클래스에도 toString메소드가 있고 
		//자식 클래스에도 있을때에 자식 클래스의 toString이 우선한다.
	}
}
