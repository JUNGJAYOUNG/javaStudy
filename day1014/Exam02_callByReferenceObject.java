class Goods
{
	private String item;
	private int qty;
	public Goods(String item,int qty){
		this.item=item;
		this.qty=qty;
	}
	public Goods(){
	}
	public void setItem(String item){
		this.item=item;
	}
	public String getItem(){
		return item;
	}
	public void setQty(int qty){
		this.qty = qty;
	}
	public int getQty(){
		return qty;
	}
	public String toString(){
		return "��ǰ��:"+item+",����:"+qty;
	}
}
class Exam02_callByReferenceObject
{
	//��ǰ �ϳ��� �Ű������� �޾� ����-1����
	public static void minus(Goods g){
		g.setQty(g.getQty()-1);	
	}

	public static void main(String[] args) 
	{
		double a[] = {2.5,3.5,4.5};
		minusOne(a);
		printArray(a);
	}
}
