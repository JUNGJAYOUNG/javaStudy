//배열의 요소가 자동으로 초기화 되듯이
//클래스의 멤버변수들도 자료형에 따라 자동으로 초기화된다.
class BankAccount {

	public static void main(String []args){
		System.out.println("BankAccount의 main입니다.");
	}
 
}

class BankAccountTest03 { //얘 main만 동작한다

	public static void main(String []args){
		System.out.println("BankAccountTest03의 main입니다.");
	}
 
}

/*
하나의 파일에 2개 이상의 클래스를 만들 때에는
파일이름과 동일한 클래스이름에 public을 붙이고
그 클래스에 있는 main메소드가 동작한다.
*/