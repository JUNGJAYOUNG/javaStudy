import java.util.Scanner;
class CellPhone
{	
	String model;	//이름
	String company;		//나이
	char gender;	//성별

	void eat(String food){
		//성별이 남인 20살 홍길동 우유를 먹어요
		System.out.printf("성별이 %c인 %d살 %s가(이) %s를 먹어요\n",gender,age,name,food);
	}

	void sleep(){
		//성별이 남인 20살 홍길동이 쿨쿨 자고 잇어요 
		System.out.printf("성별이 %c인 %d살 %s가 쿨쿨~ 자고 있어요\n",gender,age,name);
	}
}

class CellPhoneTest
{
	public static void main(String[] args) 
	{
		Person p;
		p = new Person();
		p.name ="최현호";
		p.age = 26;
		p.gender='남';
		p.eat("치맥");
		p.sleep();

		Person kim = new Person();
		kim.name = "김시아";
		kim.age = 23;
		kim.gender= '여';
		kim.eat("피콜");
		kim.sleep();
	}
}
