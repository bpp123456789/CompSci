
import java.util.Scanner;

public class priceCheckAndTax {
	static double cost;
	static double fullPrice;

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Please input how many widgets you want");
		int amount = input.nextInt();
		if (amount <= 9 && amount > 0) {
			cost = amount * 15;
		} else if (amount > 9 && amount < 15) {
			cost = amount * 12.5;
		} else if (amount >= 15) {
			cost = amount * 11.75;
		}
		System.out.println("Please input your state's abbreviation");
		String state;
		state = input.next();
		
		if (state.equals("MA")) {
			fullPrice = 0.0625 * cost + cost;
		} else if (state.equals("RI")) {
			fullPrice = 0.07 * cost + cost;
		} else if (state.equals("NH")) {
			fullPrice = cost;
		} else if (state.equals("ME")) {
			fullPrice = 0.055 * cost + cost;
		} else if (state.equals("CT")) {
			fullPrice = 0.0635 * cost + cost;
		} else {
			System.out.println("You must be from MA, RI, NH, ME, or CT");
		}
		input.close();
		System.out.println("Your full price is " + String.format("%, .2f", fullPrice));
	}	
	

}
