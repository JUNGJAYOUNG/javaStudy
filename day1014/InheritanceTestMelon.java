class Food{
	protected double cal; //�ڽ� Ŭ�������Ը� ���� ��� protected
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
		return "Į�θ�:"+cal+",����:"+price+",�߷�:"+gram;
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
		//super();����
	}

	public void setFarm(String farm){
		this.farm=farm;
	}
	public String getFarm(){
		return farm;
	}
	public void printInfo(Melon m){
		System.out.printf("Į�θ�:%f\n"+cal);
		System.out.printf("����:%d\n"+m.price);
		System.out.printf("�߷�:%.1fkg\n"+m.gram);
		System.out.printf("���� ���:%s\n"+m.farm);
	}
	//�������̵�(������:�θ��� �޼ҵ�� �Ű������� ��ȯ�ϴ°� ��� ��ġ�ؾ���)
	public String toString(){
		return super.toString()+",���۳��:"+farm;
		//super.�޼ҵ�� �θ�Ŭ������ ������ �޼ҵ带 ȣ���Ҷ�
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
		return super.toString()+",�귣��:"+brand;
		//super.�޼ҵ�� �θ�Ŭ������ ������ �޼ҵ带 ȣ���Ҷ�
	}

}
class InheritanceTestMelon
{
	public static void main(String[] args) 
	{
		Food f = new Food(200,3000,0.6);
		Melon m = new Melon(450,18000,1.5,"�ֿ���");
		Milk milk = new Milk(200,500,9.2,"�������");
		System.out.println(f);
		System.out.println(m);
		System.out.println(milk);
		//�θ� Ŭ�������� toString�޼ҵ尡 �ְ� 
		//�ڽ� Ŭ�������� �������� �ڽ� Ŭ������ toString�� �켱�Ѵ�.
	}
}
