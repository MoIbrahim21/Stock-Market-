import java.util.Scanner;

/**
 * 
 * @author mibrahim21
 *
 */
public class Stockmarketcalculations {

	public static void main(String[] args) 
	{
		Scanner user = new Scanner(System.in);
		System.out.print("Welcome to the Stock Calculator:");
		System.out.print("\n Press Enter to begin your calculations:");
		user.nextLine();
		System.out.print("\n You will now began entering your calculations");
		System.out.print("\n Enter the Number of Shares purchased:  ");
		String numberstr = user.nextLine();
		double number = Double.parseDouble(numberstr);
		
	}

}
