import java.util.Scanner;
class CellPhone
{	
	String model;		//모델명
	String company;		//제조회사
	String color;	//색상
	boolean onOff;	//전원
	boolean camera;	//카메라장착여부

	void setModel(String n){
		model=n;
	}
	void setCompany(String n){
		company=n;
	}
	void setColor(String n){
		color=n;
	}
	void setOnOff(boolean n){
		onOff=n;
	}
	void setCamera(boolean n){
		camera=n;
	}

	String getModel(){
		return model;
	}
	String getCompany(){
		return company;
	}
	String getColor(){
		return color;
	}
	public boolean getOnOff(){
		return onOff;
	}
	public void getCamera(){
		return camera;
	}

	public void turnOnOff(boolean flag){
		if(flag){
			setOnOff(true);
			System.out.println("전원 on");
		}else{
			setOnOff(false);
			System.out.println("전원 off");
		}
	}
}

class CellPhoneTest
{
	public static void main(String[] args) 
	{
		CellPhone p;
		p = new CellPhone();
		p.setModel("아이폰13");
		p.setCompany("애플");
		p.setColor("시에라블루");
		p.setOnOff(true);
		p.setCamera(true);
		p.turnOnOff(false);
		
		System.out.printf("모델명:%s",p.getModel());
		System.out.printf("제조회사:%s",p.getCompany());
		System.out.printf("색상:%s",p.getColor());
		System.out.printf("모델명:%s",p.getOnOff());
		System.out.printf("모델명:%s",p.getCamera());
		System.out.printf("모델명:%s",p.turnOnOff());
	
	}
}
