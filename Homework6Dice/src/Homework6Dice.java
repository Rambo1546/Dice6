import java.util.Scanner;
import java.util.Random;

public class Homework6Dice {
	
	public static void main(String[] args) {
		
		Scanner MyScan = new Scanner(System.in);
		
		//Declaring variables.
		String UserChoice = null;
		int LastChoice = 0;
		int GamesWon = 0 ;
		int Restart = 0;
		int WinningP = 0;
		int  GamesLost = 0;
		int  TotalGames = 0;
		
		int Answer = (int)Math.ceil(Math.random()*6);
		
		
		while (Restart == 0){
			System.out.println(" I just rolled the single dice. Guess if it is odd or even. Type odd or even. ");
			UserChoice = MyScan.nextLine();
			Restart = 1;
			
			
			
		
			 	
		if (UserChoice == "even" || Answer == 2 || Answer == 4 || Answer == 6){
			System.out.printf(" You are correct. The dice rolled a %d.", Answer);
			System.out.printf(" Would you like to play again? 1 to quit and 2 to stay. ");
			LastChoice = MyScan.nextInt();
			
			++GamesWon;
			++TotalGames;
			
			
			 }
		
		else if (UserChoice == "even" || Answer != 2 || Answer != 4 || Answer != 6){
			System.out.printf(" You are wrong. the dice rolled a %d. ", Answer);
			
			++GamesLost;
			++TotalGames;
		
			
			System.out.printf(" Would you like to play again? 1 to quit and 2 to stay. ");
			LastChoice = MyScan.nextInt();
			
			
			
		}
		
		else if (UserChoice == "odd" || Answer == 1 || Answer == 3 || Answer == 5){
			System.out.printf(" You are correct. The dice rolled a %d.", Answer);
			
			System.out.printf(" Would you like to play again? 1 to quit and 2 to stay. ");
			LastChoice = MyScan.nextInt();
			
			++GamesWon;
			++TotalGames;
			

			
			
		}
			 
		
		else if (UserChoice == "odd" || Answer != 1 || Answer != 3 || Answer != 5){
			System.out.printf(" You are wrong. the dice rolled a %d. ", Answer);
			
			System.out.printf(" Would you like to play again? 1 to quit and 2 to stay. ");
			LastChoice = MyScan.nextInt();
			
			++GamesLost;
			++TotalGames;
			
			
			 
			 
		}
		
		
		WinningP = (GamesWon * 100) / TotalGames;
		if (LastChoice == 1){
			System.out.println(" You quit. Quiter.Goodbye. ");
			System.out.printf(" Also you won %d games, lost %d games, and played a total of %d games. ",GamesWon,GamesLost,TotalGames);
			System.out.printf(" Your games won percentage is %d percent." , WinningP);
		}
		
		else if (LastChoice == 2){
			System.out.println(" You chose to stay. Thank you.");
			Restart = 0;
		}
		
		
		
	}
}
			
}
			
		
// Please look into the mod (%) function and how it can be used to determine if the number is odd/even.		
	


