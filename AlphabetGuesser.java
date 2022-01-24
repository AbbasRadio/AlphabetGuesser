/*
Write a Java program that randomly picks an English alphabet (A-Z) and keeps asking the user to guess the alphabet until he/she has got it right. Also report the number of trials.
*/
import java.util.*;
import java.lang.*;

class AlphabetGuess{
	
	Scanner sc = new Scanner(System.in);
	public void checkChar(){
		String input;
		int flag=0,count=0,num=0;
		while(flag == 0){
			System.out.print("\n Enter Any Letter : ");
			input = sc.next();
			char ch = input.charAt(0);
			num = Integer.valueOf(ch);
			if(num >=65 && num <= 90){
				int min=65,max=90;
				int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
				if((char)random_int == ch){
					System.out.print(" Correct");
					break;
				}
				System.out.print(" Wrong");
			}else if(num >=97 && num <= 122){
				int min=97,max=122;
				int random_int = (int)Math.floor(Math.random()*(max-min+1)+min);
				if((char)random_int == ch){
					System.out.print(" Correct");
					break;
				}
				System.out.print(" Wrong");
			}
			count++;
		}
		System.out.println("\n Number Of Attempts : "+count);
	}
}
class AlphabetGuesser{
	public static void main(String args[]){
		AlphabetGuess assign = new AlphabetGuess();
		assign.checkChar();
	}
}
