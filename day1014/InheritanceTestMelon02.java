class Food{
	protected double cal; //�ڽ� Ŭ�������Ը� ���� ��� protected
	protected int price;
	protected double gram;
	
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
	
	public void setFarm(String farm){
		this.farm=farm;
	}
	public String getFarm(){
		return farm;
	}
	public static void printInfo(Melon m){
		System.out.printf("Į�θ�: %f\n"+cal);
		System.out.printf("����:%d\n"+price);
		System.out.printf("�߷�:%.1 fkg\n"+gram);
		System.out.printf("���� ���:%s\n"+farm);
	}
}
class InheritanceTestMelon02
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
