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
		System.out.println("칼로리:"+m.cal);
		System.out.println("가격:"+m.price);
		System.out.println("중량:"+m.gram);
		System.out.println("경작 농원:"+m.farm);
	}

	public static void main(String[] args) 
	{
		Melon m = new Melon();
		printInfo(m);


	}
}
