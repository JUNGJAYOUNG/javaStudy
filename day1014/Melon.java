class Food{
	protected double cal; //�ڽ� Ŭ�������Ը� ���� ��� protected
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
		System.out.printf("Į�θ�: %f\n"+m.cal);
		System.out.printf("����:%d\n"+m.price);
		System.out.printf("�߷�:%.1 fkg\n"+m.gram);
		System.out.printf("���� ���:%s\n"+m.farm);
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
		m.setFarm("�ֿ���");
		m.printInfo();
=
	}
}
