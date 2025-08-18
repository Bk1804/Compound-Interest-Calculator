
package thesecondtrial;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		// Compound Interest Calculator
		// This program will take as input principal, interest rate and number of periods
		// And calculate total funds at the end of the time period stated
		// total_funds = P*(i+1)^n where n is the number of periods and P is the principal amount
		// compound_interest = total_funds - P;
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("What is the principal amount: ");
	float P = scanner.nextFloat();
	
	System.out.print("What is the interest rate (in percentage): ");
	float i = scanner.nextFloat()/100;
	
	System.out.print("What is the number of periods: ");
	int n = scanner.nextInt();
	
	double compound_i = Math.pow(i+1.00, n)*P - P;
	
	System.out.printf("Compound interest is: %.2f " ,compound_i);
	scanner.close();	
	}	
}
