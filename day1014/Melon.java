class Food{
	protected double cal; //자식 클래스에게만 접근 허용 protected
	protected int price;
	protected double gram;
	
	public Food(){

	}		
	public Food(double cal, int price, double gram){
		this.cal=cal;
		this.price=price;
		this.gram=gram;
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
}

class Melon extends Food
{
	private String farm;
	
	public Melon(){
	}
	public Melon(double cal, int price, double gram, String farm){
		super(cal,price,gram);
		this.farm=farm;
	}

	public void setFarm(String farm){
		this.farm=farm;
	}
	public String getFarm(){
		return farm;
	}
	public static void printInfo(Melon m){
		System.out.printf("칼로리: %f\n"+m.cal);
		System.out.printf("가격:%d\n"+m.price);
		System.out.printf("중량:%.1 fkg\n"+m.gram);
		System.out.printf("경작 농원:%s\n"+m.farm);
	}
}
class InheritanceTestMelon
{
	public static void main(String[] args) 
	{
		Melon m = new Melon();
		m.setCalories(450);
		m.setPrice(20000);
		m.setWeight(1.5);
		m.setFarm("쌍용농원");
		m.printInfo();
=
	}
}
