class Department{
	private int number;
	private String name;
	private String address;

	public Department(){
		number=001;
		name="총무부";
		address="서울";
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

class DepartmentTest{

	public static void main(String[] args){

		Department d1;

		d1=new Department(); 

		System.out.println(d1);
		d1.setNumber(002);
	    d1.setName("전산팀");
		
		System.out.println(d1);

	}
}
