import java.util.Scanner;
class Person
{	
	String name;	//이름
	int age;		//나이
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

class PersonTest 
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
	}
}
