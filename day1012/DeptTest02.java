class Dept{
	private int number;
	private String name;
	private String address;

	public Dept(int number,String name,String address){
		this.number=number;
		this.name=name;
		this.address=address;
	}

	//멤버 변수 name의 값을 설정(변경)하는 메소드를 정의
	public void setNumber(int n){
		this.number = n;	//멤버변수보다 매개변수가 우선순위가 높다
	}

	public int getNumber(){
		return number; //리턴값이 있다
	}
	
	
	public void setName(String n){
		this.name = n;	//멤버변수보다 매개변수가 우선순위가 높다
	}

	public String getName(){
		return name; //리턴값이 있다
	}
	
	public void setAddress(String n){
		this.address = n;
	}
	public String getAddress(){
		return address;
	}

	public String toString(){
		String result = "";
		result += "부서번호:"+this.number+"\n";
		result += "부서명:"+this.name+"\n";
		result += "부서위치:"+this.address+"\n";
		return result;
	}

}

class DeptTest02{

	public static void main(String[] args){

		Dept d1;
	
		d1=new Dept(10,"총무팀","서울"); 
		Dept d2=new Dept(20,"개발팀","제주");

		System.out.println(d1);
		System.out.println(d2);

	}
}
