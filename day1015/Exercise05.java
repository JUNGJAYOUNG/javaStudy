class Animal{
	String name;
	public Animal(){
		name="UNKNOWN";
		System.out.println("�����Դϴ�:"+name);
	}
	
	public Animal(String name){
		this.name = name;
		System.out.println("�����Դϴ�:"+name);
	}

}

class Lion extends Animal{
	public Lion(){
		System.out.println("�����Դϴ�.");
	}
	public Lion(String name){
		super(name);
		System.out.println("�����Դϴ�.");
	}

}

class GraduateStudent extends Student{
	public String lab;
}

class Excercise05 
{
	public static void main(String[] args) 
	{
		
	}
}
