import java.util.Scanner;
class CellPhone
{	
	String model;		//�𵨸�
	String company;		//����ȸ��
	String color;	//����
	boolean onOff;	//����
	boolean camera;	//ī�޶���������

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
			System.out.println("���� on");
		}else{
			setOnOff(false);
			System.out.println("���� off");
		}
	}
}

class CellPhoneTest
{
	public static void main(String[] args) 
	{
		CellPhone p;
		p = new CellPhone();
		p.setModel("������13");
		p.setCompany("����");
		p.setColor("�ÿ�����");
		p.setOnOff(true);
		p.setCamera(true);
		p.turnOnOff(false);
		
		System.out.printf("�𵨸�:%s",p.getModel());
		System.out.printf("����ȸ��:%s",p.getCompany());
		System.out.printf("����:%s",p.getColor());
		System.out.printf("�𵨸�:%s",p.getOnOff());
		System.out.printf("�𵨸�:%s",p.getCamera());
		System.out.printf("�𵨸�:%s",p.turnOnOff());
	
	}
}
