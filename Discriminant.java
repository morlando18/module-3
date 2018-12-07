import java.util.Scanner;
public class Discriminant {
	
	public static void main(String[] args){
		
		//variables
		double discriminant, a , b, c, rout1, rout2;
		Scanner input = new Scanner(System.in);
		
		
		//input
		System.out.print("Enter a, b, c: ");
		a = input.nextDouble();
		b = input.nextDouble();
		c = input.nextDouble();

		//equation
		discriminant = Math.pow(b, 2) - 4 * a * c;
		rout1 = (-b + Math.pow(discriminant, 0.5)) / 2*a;
		rout2 = (-b - Math.pow(discriminant, 0.5)) / 2*a;
		
		// checking 
		if (discriminant < 0)
			System.out.print("The equation has no real roots ");
		else if(discriminant == 0)		
			System.out.print("The equation has one roots " + rout1);
		else if(discriminant > 0)
			System.out.print("The equation has two roots " + rout1 + " and " + rout2);

		
		
	}

}
