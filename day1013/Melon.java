class Food{
	protected double cal;
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
	String farm;
	
	public void printInfo(Melon m){
		System.out.println("Į�θ�:"+m.cal);
		System.out.println("����:"+m.price);
		System.out.println("�߷�:"+m.gram);
		System.out.println("���� ���:"+m.farm);
	}

	public static void main(String[] args) 
	{
		Melon m = new Melon();
		printInfo(m);


	}
}
