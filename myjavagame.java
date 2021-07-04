import java.util.Random;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("****************************welcome*************************");
		System.out.println("Please enter your name");
		Scanner take=new Scanner(System.in);
		String name=take.next();
		System.out.println("Hello " + name);
		System.out.println("enter 1 to start the game 0 to no");
		int start= take.nextInt();
		while(start == 0)
		{
			System.out.println("Please enter  1 to start the game");
			start = take.nextInt();
			continue;
		}
		
		System.out.println("Guess number between 0 to 20");
		Random numb= new Random();
		int guessme= numb.nextInt(20);
		System.out.println(guessme);
		System.out.println("enter ur guess number");
		int inpt = take.nextInt();
		
		int i=0;
		while(i<5)
		{
	
			
			if(guessme <20){
			if(guessme == inpt){
				System.out.println("congrats");
				
			System.out.println("THANK YOU");
System.out.println("******************************END***************************");	
			System.exit(0);
			}
			else if(guessme > inpt)
			{
				System.out.println("your number is smaller than guess number");
				inpt = take.nextInt();
			}
			else if(guessme <inpt)
			{
				System.out.println("Your number is greater than guess number");
				inpt = take.nextInt();
			}
			}
			
			i++;
		continue;
		}
		
		System.out.println("THANK YOU");
System.out.println("******************************END***************************");
	}
}