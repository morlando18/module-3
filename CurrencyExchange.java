import java.util.Scanner;
public class CurrencyExchange {
	
	public static void main(String[] args){

		// variables 
		double exchangeRate, dollar, yuan;
		int choice;
		Scanner input = new Scanner(System.in);
		
		//ask
		System.out.print("Enter the exchange rate from dollars to RMB: ");
		exchangeRate = input.nextDouble();
		System.out.print("Enter 0 to convert dollars to RMB and 1 vice versa: ");
		choice = input.nextInt();
		
		//choice
		if(choice == 0){
			System.out.print("Enter the dollar amount: ");
			dollar = input.nextDouble();
			yuan = dollar * exchangeRate;
			System.out.println("$" + dollar + " is " + yuan + " yuan");
		}else if (choice == 1){
			System.out.print("Enter the RMB amount: ");
			yuan = input.nextDouble();
			dollar = yuan / exchangeRate;
			System.out.println(yuan + " yuan is $" + dollar);
		}else
			System.out.println("incorrect input");
		
	}	

}
