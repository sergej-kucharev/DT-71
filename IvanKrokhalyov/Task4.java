import java.io.*;
import java.util.*;
public class Program{ 
    public static boolean isNumeric(String strNum) {
    	return strNum.matches("-?\\d+(\\.\\d+)?");
    }
    public static void main (String args[]){
	Random random=new Random();
	int our_number=random.nextInt(100);
	Scanner in=new Scanner(System.in);
	while(1==1){
		System.out.println("Введи число от 0 до 100.");
		String temp=in.nextLine();
		if (temp.isEmpty()) temp=in.nextLine();
		//System.out.println(temp);
		if(temp.length()>3||(!isNumeric(temp))){
			System.out.println("А на этот раз введи правильно!!!");
			continue;
		}
		int i=Integer.parseInt(temp);
		if ((i>100)||(i<0)){
			System.out.println("Ну ты и дурень. Вводи заново.");
                        continue;
		}
		if(i<our_number){
			System.out.printf("К сожалению, не угадал, искомое число больше. Попробуй в интервале [%d,%d]\n",i+random.nextInt(our_number-i+1), our_number+random.nextInt(101-our_number));
			continue;
		}
		else if(i>our_number){
			System.out.printf("К сожалению, не угадал, искомое число меньше. Попробуй в интервале [%d,%d]\n",our_number-random.nextInt(our_number+1),i-random.nextInt(i-our_number));
                        continue;
		}
		else{
			System.out.println("Поздравляю, ты справился с нелегкой игрой. Чтобы начать заново, нажми Y. Чтобы завершить игру, нажми любую другую кнопку.");
			String c=in.next();
			if(c.equals("Y")){
				our_number=random.nextInt(100);
				continue;
			}
			else{
				break;
			}
		}
	}
    }
}



