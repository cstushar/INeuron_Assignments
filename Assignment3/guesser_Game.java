import java.util.Random;
import java.util.Scanner;

class guesser{
		int randomNum;
		int randomFunc(){
			Random ob = new Random();
			randomNum=ob.nextInt(10);
			return randomNum;
		}
	}

class player{
	int guessNum;
	int guessFunc1(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Player 1 Guess the number : ");
		guessNum= sc.nextInt();
		return guessNum;
	}
	int guessFunc2(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Player 2 Guess the Number : ");
		guessNum= sc.nextInt();
		return guessNum;
	}
	int guessFunc3(){
		Scanner sc=new Scanner(System.in);
		System.out.print("Player 3 Guess the Number : ");
		guessNum= sc.nextInt();
		return guessNum;
	}
}

class umpire{
	int takeRandom;
	int takePlayer1;
	int takePlayer2;
	int takePlayer3;
	
	void takeGuessNum() {
		guesser guess = new guesser();
		takeRandom=guess.randomFunc();
	}
	void takePlayerNum() {
	
		player ob = new player();
		takePlayer1=ob.guessFunc1();
		takePlayer2=ob.guessFunc2();
		takePlayer3=ob.guessFunc3();
	}
	void compareFunc() {
		System.out.println("The number is : "+ takeRandom);
		if(takeRandom==takePlayer1) {
			if(takeRandom==takePlayer2 && takeRandom ==takePlayer3) {
				System.out.println("All Players Guessed the Correct Number");
			}
			else if(takeRandom==takePlayer2) {
				System.out.println("Player1 & Player2 Guessed the Correct Number");
			}
			else if(takeRandom==takePlayer3) {
				System.out.println("Player1 & Player3 Guessed the Correct Number");
			}
			else {
				System.out.println("Player1 won the Game");
			}
		}
		else if(takeRandom==takePlayer2) {
			if(takeRandom==takePlayer3) {
				System.out.println("Player2 & Player3 Guessed the Correct Number");
			}
			else {
				System.out.println("Player2 won the Game");
			}
		}
		else if(takeRandom==takePlayer3) {
			System.out.println("Player3 won the Game");
		}
		else {
			System.out.println("No Player won the Game");
		}
	}
}

public class guesser_Game {

	public static void main(String[] args) {
		System.out.println("Welcome to the Guesser game , All 3 Players guess any no btw 1 to 10");
		umpire ob = new umpire();
		ob.takeGuessNum();
		ob.takePlayerNum();
		ob.compareFunc();
				

	}

}
