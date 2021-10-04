//사주팔자 ㅠㅠ
import java.util.Scanner;
class DestinyTest
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		String name,sign,time;
		int month,day;

		System.out.print("이름을 입력하세요:");
		name=input.next();
		System.out.print("띠를 입력하세요:");
		sign=input.next();
		System.out.print("태어난 월을 입력하세요:");
		month=input.nextInt();
		System.out.print("태어난 일를 입력하세요:");
		day=input.nextInt();
		System.out.print("태어난 시간을 십이지신으로 입력하세요:");
		time=input.next();
		
		String []list={"자","축","인","묘","진","사","오","미","신","유","술","해"};
		String []animal={"쥐","소","범","토끼","용","뱀","말","양","원숭이","닭","개","돼지"};
		String []mean={"천귀","천액","천권","천파","천인","천문","천복","천고","천역","천간","천수","천명"};
		String []user= new String[4];
		
		int index;
		for(int i=0;i<list.length;i++){
			if(sign.equals(animal[i])){
				user[0]=mean[i];
				index=i;
			}
		}
		int move1=index+month-1;
		if(move1>list.length-1){
			move1
		}


				user[1]=mean[i2];
				i2=0;
				int i3=i2+day-1;
				user[2]=mean[i3];
				if(time.equals(list[i])){
					i3=0;
					int i4=i3+i-1;
					user[3]=mean[i4];
		


		System.out.print(name+"님의 사주:");
		for(int i=0;i<user.length;i++){	
			System.out.print(user[i]+" ");
		}
    }
}