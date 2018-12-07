import java.util.Scanner;
public class RockPaperScissor {
	
	public static void main(String[] args){
		
		// variables 
		int number, numberInput;
		Scanner input = new Scanner(System.in);
		String numberName, numberName2;
		
		// ask
		System.out.print("scissor (0), rock(1), paper (2): ");
		numberInput = input.nextInt();

		//generating random number
		number = (int)(Math.random() * 3);
		
		//initiating 
		numberName = "initiated";
		numberName2 = "initiated2";
		
		//naming
		switch(numberInput){
		case 0: numberName = "scissor";	break;
		case 1: numberName = "rock";	break;
		case 2: numberName = "paper";	break;
		}
		
		switch(number){
		case 0: numberName2 = "scissor";break;
		case 1: numberName2 = "rock";	break;
		case 2: numberName2 = "paper";	break;
		}
		
		//ifs
		if(numberInput == number)
			System.out.println("The computer is " + numberName2 + ". You are " + numberName + " too. It is a draw");
		else if (number == 2 && numberInput == 0)
			System.out.println("The computer is " + numberName2 + ". You are " + numberName + " .  You won");
		else if (number == 0 && numberInput == 2)
			System.out.println("The computer is " + numberName2 + ". You are " + numberName + " .  Computer won");
		else if (number == 1 && numberInput == 0)
			System.out.println("The computer is " + numberName2 + ". You are " + numberName + " .  Computer won");
		else if (number == 0 && numberInput == 1)
			System.out.println("The computer is " + numberName2 + ". You are " + numberName + " .  You won");
		else if (number == 2 && numberInput == 1)
			System.out.println("The computer is " + numberName2 + ". You are " + numberName + " .  Computer won");
		else if (number == 1 && numberInput == 2)
			System.out.println("The computer is " + numberName2 + ". You are " + numberName + " .  You won");
											
	}

}
